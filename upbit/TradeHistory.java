package upbit;

import java.io.Serializable;
import java.util.Date;

import upbit.CoinList.CoinSymbol;
import upbit.CoinList.Market;

@SuppressWarnings("serial")
public class TradeHistory implements Serializable
{
	public enum TradeType
	{
		Buy, Sell, Withdraw, Deposit
	}

	private Date date;
	private Market market;
	private CoinSymbol coinSymbol;
	private TradeType tradeType;
	private double quantity;
	private double tradePrice;
	private double orderPrice;
	private double totalPrice;
	private double fee;

	/**
	 * @param date �ֹ��ð�
	 * @param market �ŷ�����
	 * @param coinSymbol ���νɺ�
	 * @param tradeType �ŷ�����
	 * @param quantity �ŷ�����
	 * @param tradePrice �ŷ��ܰ�
	 * @param orderPrice �ŷ��ݾ�
	 * @param totalPrice ����ݾ�(������ݿ�)
	 * @param fee ������
	 */
	public TradeHistory(Date date, Market market, CoinSymbol coinSymbol, TradeType tradeType, double quantity,
			double tradePrice, double orderPrice, double totalPrice, double fee)
	{
		this.date = date;
		this.market = market;
		this.coinSymbol = coinSymbol;
		this.tradeType = tradeType;
		this.quantity = quantity;
		this.tradePrice = tradePrice;
		this.orderPrice = orderPrice;
		this.totalPrice = totalPrice;
		this.fee = fee;
	}
	
	
	
	public Date getDate()
	{
		return date;
	}

	public void setDate(Date date)
	{
		this.date = date;
	}

	public Market getMarket()
	{
		return market;
	}

	public void setMarket(Market market)
	{
		this.market = market;
	}

	public CoinSymbol getCoinSymbol()
	{
		return coinSymbol;
	}

	public void setCoinSymbol(CoinSymbol coinSymbol)
	{
		this.coinSymbol = coinSymbol;
	}

	public TradeType getTradeType()
	{
		return tradeType;
	}

	public void setTradeType(TradeType tradeType)
	{
		this.tradeType = tradeType;
	}

	public double getQuantity()
	{
		return quantity;
	}

	public void setQuantity(double quantity)
	{
		this.quantity = quantity;
	}

	public double getTradePrice()
	{
		return tradePrice;
	}

	public void setTradePrice(double tradePrice)
	{
		this.tradePrice = tradePrice;
	}

	public double getOrderPrice()
	{
		return orderPrice;
	}

	public void setOrderPrice(double orderPrice)
	{
		this.orderPrice = orderPrice;
	}

	public double getTotalPrice()
	{
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice)
	{
		this.totalPrice = totalPrice;
	}

	public double getFee()
	{
		return fee;
	}

	public void setFee(double fee)
	{
		this.fee = fee;
	}

}
