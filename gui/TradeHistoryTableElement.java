package gui;

import java.text.DecimalFormat;

import upbit.CoinList.Market;
import upbit.Order;

public class TradeHistoryTableElement
{
	private Order order;
	
	public TradeHistoryTableElement(Order order)
	{
		this.setOrder(order);
	}
	
	public Object[] getData()
	{
		Object[] data = new Object[8];
		DecimalFormat decimalFormat;
		
		
		data[0] = getOrder().getMarket() == Market.KRW ? "��ȭ" : getOrder().getMarket().toString();
		
		data[1] = getOrder().getCoinSymbol().toString();
		
		data[2] = (getOrder().getDate().getMonth() + 1) + "/" + getOrder().getDate().getDate() + " " + getOrder().getDate().getHours() + ":" + getOrder().getDate().getMinutes();
		
		data[3] = getOrder().isBuy() ? "�ż�" : "�ŵ�";
		
		decimalFormat = new DecimalFormat("#,###.#");
		data[4] = decimalFormat.format(getOrder().getTradePrice());
		data[6] = decimalFormat.format(getOrder().getTotalPrice());

		decimalFormat = new DecimalFormat("#,###.########");
		data[5] = decimalFormat.format(getOrder().getQuantity_Conclusion());
		
		data[7] = getOrder().isConclusion() ? "ü���" : "���";
		
		return data;
	}

	public Order getOrder()
	{
		return order;
	}

	public void setOrder(Order order)
	{
		this.order = order;
	}
}
