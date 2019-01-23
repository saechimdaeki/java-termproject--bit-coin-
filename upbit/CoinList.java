package upbit;

import java.util.ArrayList;
import java.util.Arrays;

public class CoinList
{
	public enum Market
	{
		KRW, BTC, ETH, /*USDT*/
	}
	
	public enum CoinSymbol
	{
		BTC, ADA, EOS, TRX, STORM, IGNIS, XRP, GTO, XLM,
		SC, ETH, SNT, QTUM, BCH, NEO, SBD, ETC, ARDR, GRS,
		XMR, STEEM, GNT, ICX, LSK, XEM, POWR, MER, EMC2,
		STRAT, OMG, LTC, TIX, BTG, PIVX, MCO, WAVES, STORJ,
		DASH, KMD, VTC, MTL, REP, ARK, ZEC, XVG, PART, SRN, DGB,
		NXT, POLY, RDD, DCR, TUSD, ADDR, ZRX, ZEN, DOGE, OCN, PAY, GAME,
		NXS, WAX, VEE, EDG, XZC, RLC, SYS, TUBE, BAT, BLOCK, FCT, MONA,
		VIB, SALT, MANA, ADX, DCT, BURST, GUP, RVR, LBC, CLOAK, GBYTE, MUE,
		VIA, CVC, SLS, ENG, DMT, LRC, DNT, UKG, IOP, BAY, ADT, LUN, OK, HMQ,
		XEL, XDN, UBQ, NGC, SHIFT, ANT, BITB, UP, NAV, CFI, RCN, GNO, FTC, BLK,
		DYN, BCPT, ION, RADS, VRC, NBT, AMP, NMR, WINGS, PTOY, BNT, SYNX, KORE,
		EXP, AID, BLT, EXCL, BSD, SWT, TX, QRL, SPHR, PRO, MEME, SIB, UNB
	
	}
	
	public enum CoinNameKR
	{
		��Ʈ����, ���̴�, �̿���, Ʈ��, ����, �̱״Ͻ�, ����, ������, ���ڶ���,
		�þ�����, �̴�����, �������ͽ���Ʈ��ũ��ū, ����, ��Ʈ����ĳ��, �׿�, �����޷�, �̴�����Ŭ����, �ƴ�, �׷ν�������,
		��׷�, ����, ��, ������, ����ũ, �����ڳ�̹����Ʈ, �Ŀ�����, ��ť��, ���ν�Ÿ�̴�,
		��Ʈ��Ƽ��, ���̼���, ����Ʈ����, ���ƽ��, ��Ʈ���ΰ��, �Ǻ���, ����, ���̺�, ���丮��,
		���, �ڸ�, ��Ʈ����, ��Ż, ���, ��ũ, ��ĳ��, ����, ��ƼŬ, �ø���ū, ��������Ʈ, ������Ƽ, �����ž�, ��������, ��ũ����,
		Ʈ��USD, ���ο���, ��ĳ��, ��������, ������, �ٿ���������ū, ����ũ����, �ؼ���, �ν�, ��Ϻ���, ��������, ������, ������,
		�ý�����, ��ƮƩ��, ���������ټ���ū, ��ϳ�, ����, ������, ���̹�����Ʈ, ��Ʈ, ��Ʈ������, �ֵ忢��,
		��Ʈ, ����Ʈ����, ����, �������VR, ����˿���ũ����, Ŭ������, ����Ʈ��, ����͸�����, �������,
		�ú�, ��罺, �̴ϱ׸�, ����, ������, ��Ʈ��0x, �������ΰ��, ���ͳݿ�������, ��Ʈ����, �ֵ�����,
		���, ������ĳ��, ����ƽ, �����г�Ʈ, ����, ��������, ����Ʈ, �ƶ��, ��Ʈ��, ����ū, ��������,
		���Ŀ����, ���ǿ�ũ������Ʈ��ũ, ��ý�, �������, ������, ���̳���, ��ϸ��̽�, ���̿�, ����, ��������, ������, ���̿���,
		���޷���, �����ٿ�, ���̼��丮, ���ڸ�, �ŵ�����Ʈ, �ھ�����, �ͽ��潺, ���̵�����, ���, �ͽ�Ŭ��ú�����, ��Ʈ����, ������Ƽ��ū,
		Ʈ����������, ���Ҹ�������Ʈ����, ���Ǿ�, ������, �޸�ƽ, �ú�����ü����������, ��극��Ŀ������
		
	}
	
	public enum CoinNameUS
	{
		
	}
	
	public static ArrayList<CoinSymbol> listKRW = new ArrayList<CoinSymbol>(Arrays.asList(
			CoinSymbol.ADA, CoinSymbol.ARDR, CoinSymbol.ARK, CoinSymbol.BCH, CoinSymbol.BTC, CoinSymbol.BTG,
			CoinSymbol.DASH, CoinSymbol.EMC2, CoinSymbol.EOS, CoinSymbol.ETC, CoinSymbol.ETH, CoinSymbol.GNT, 
			CoinSymbol.GRS, CoinSymbol.GTO, CoinSymbol.ICX, CoinSymbol.IGNIS, CoinSymbol.KMD, CoinSymbol.LSK, 
			CoinSymbol.LTC, CoinSymbol.MCO, CoinSymbol.MER, CoinSymbol.MTL, CoinSymbol.NEO, CoinSymbol.OMG, 
			CoinSymbol.PIVX, CoinSymbol.POWR, CoinSymbol.QTUM, CoinSymbol.REP, CoinSymbol.SBD,CoinSymbol.SC,
			CoinSymbol.SNT, CoinSymbol.STEEM, CoinSymbol.STORJ, CoinSymbol.STORM,CoinSymbol.STRAT, CoinSymbol.TIX,
			CoinSymbol.TRX, CoinSymbol.VTC, CoinSymbol.WAVES, CoinSymbol.XEM,CoinSymbol.XLM, CoinSymbol.XMR, 
			CoinSymbol.XRP, CoinSymbol.ZEC
			));
	
	public static ArrayList<CoinSymbol> listBTC = new ArrayList<CoinSymbol>(Arrays.asList(
			CoinSymbol.DGB, CoinSymbol.POLY, CoinSymbol.NXT, CoinSymbol.RDD, CoinSymbol.DCR,CoinSymbol.TUSD, 
            CoinSymbol.ZRX, CoinSymbol.ZEN, CoinSymbol.DOGE, CoinSymbol.OCN, CoinSymbol.PAY,
            CoinSymbol.GAME, CoinSymbol.NXS, CoinSymbol.WAX, CoinSymbol.EDG, CoinSymbol.VEE, CoinSymbol.XZC,
            CoinSymbol.RLC, CoinSymbol.TUBE, CoinSymbol.SYS, CoinSymbol.BAT, CoinSymbol.BLOCK, CoinSymbol.FCT,
            CoinSymbol.MONA, CoinSymbol.VIB, CoinSymbol.SALT, CoinSymbol.ADX, CoinSymbol.MANA, CoinSymbol.DCT,
            CoinSymbol.GUP, CoinSymbol.BURST, CoinSymbol.RVR, CoinSymbol.LBC, CoinSymbol.GBYTE, CoinSymbol.CLOAK,
            CoinSymbol.MUE, CoinSymbol.CVC, CoinSymbol.VIA, CoinSymbol.ANT, CoinSymbol.ENG, CoinSymbol.SLS, CoinSymbol.DMT,
            CoinSymbol.LRC, CoinSymbol.DNT, CoinSymbol.UKG, CoinSymbol.ADT, CoinSymbol.IOP, CoinSymbol.BAY, CoinSymbol.LUN,
            CoinSymbol.XEL, CoinSymbol.UBQ, CoinSymbol.HMQ, CoinSymbol.XDN, CoinSymbol.SHIFT, CoinSymbol.NGC, CoinSymbol.OK,
            CoinSymbol.BITB, CoinSymbol.UP, CoinSymbol.NAV, CoinSymbol.GNO, CoinSymbol.CFI, CoinSymbol.RCN,CoinSymbol.FTC, 
            CoinSymbol.BLK, CoinSymbol.BCPT, CoinSymbol.DYN, CoinSymbol.ION, CoinSymbol.RADS, CoinSymbol.VRC, CoinSymbol.PTOY,
            CoinSymbol.AMP, CoinSymbol.NMR, CoinSymbol.WINGS, CoinSymbol.BNT, CoinSymbol.NBT, CoinSymbol.SYNX, CoinSymbol.EXP,
            CoinSymbol.KORE, CoinSymbol.AID, CoinSymbol.BSD, CoinSymbol.BLT, CoinSymbol.EXCL, CoinSymbol.SWT, CoinSymbol.TX,
            CoinSymbol.PRO, CoinSymbol.SIB, CoinSymbol.QRL, CoinSymbol.SPHR, CoinSymbol.UNB, CoinSymbol.MEME
			));
	
	public static ArrayList<CoinSymbol> listETH = new ArrayList<CoinSymbol>(Arrays.asList());

	
	public static CoinNameKR getCoinNameKR(CoinSymbol coinSymbol)
	{
		int index = 0;
		int target = coinSymbol.ordinal();
		
		for (CoinNameKR coinNameKR : CoinNameKR.values())
		{
			if (index == target)
				return coinNameKR;
			
			index++;
		}
		
		return null;
	}
}
