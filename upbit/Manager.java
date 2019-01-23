package upbit;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import gui.GUI;

public class Manager
{
	private ScheduledThreadPoolExecutor scheduledExecutor;
	private ExecutorService executorService;
	
	private Account account;
	private Upbit upbit;
	private GUI gui;
	private DynamicCrawler crawler;
	private Stat stat;
	
	
	public Manager()
	{
		initiate();
	}
	
	public void initiate()
	{
		System.out.println("##############################");
		
		long startTime, endTime;
		startTime = System.currentTimeMillis();
		
		scheduledExecutor = new ScheduledThreadPoolExecutor(6);
		executorService = new ThreadPoolExecutor(4, 8, 5, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>());
		
//		SaveManager saveManager = new SaveManager();
//		
//		if (saveManager.load())
//		{
//			account = saveManager.getAccountList().get(0);
//		}
//		else
//		{
//			saveManager.getAccountList().add(account);
//		}		
		account = new Account("id", "password", 5000000);
		account.setStat(new Stat(account.getKRW()));
		
		Future<?> futureUpbit = executorService.submit(()-> upbit = new Upbit(account));
		Future<?> futureCrawler = executorService.submit(()-> crawler = new DynamicCrawler(true));
		Future<?> futureGui = executorService.submit(()-> gui = new GUI());

		try
		{
			futureUpbit.get();
			futureCrawler.get();
			futureGui.get();
		}
		catch (InterruptedException | ExecutionException e)
		{
			System.out.println("Failed to initiate");
			e.printStackTrace();
		}

		// Upbit
		upbit.setScheduledExecutor(scheduledExecutor);
		upbit.setExecutorService(executorService);
		upbit.setGui(gui);
		upbit.setCrawler(crawler);
//		upbit.setCryptoList(saveManager.getCryptoList());
//		upbit.setSaveManager(saveManager);
		
		// GUI
		gui.setCrawler(crawler);	
		gui.setUpbit(upbit);
		gui.setExecutorService(executorService);
		
		// DynamicCralwer
		crawler.setExecutorService(executorService);
		
		// SavaManager
//		saveManager.setScheduledExecutor(scheduledExecutor);
//		saveManager.setUpbit(upbit);
//		saveManager.autoSave();

		futureUpbit = executorService.submit(() -> upbit.initiate());
		gui.initiate();
		crawler.initiate();
		
		// GUI �����ֱ�
		gui.setVisible(true);
		
		endTime = System.currentTimeMillis();
		
		System.out.println("Initiate complete, " + (endTime - startTime) + "ms");
		System.out.println("##############################");
	}
}
