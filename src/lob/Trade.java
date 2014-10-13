package lob;

public class Trade {
	private int timestamp;
	private double price;
	private int qty;
	private String provider;
	private String taker;
	private String buyer;
	private String seller;
	private long orderHit;
	
	public Trade(int time, double price, int qty, String provider, 
				 String taker, String buyer, String seller, long orderHit) {
		this.timestamp = time;
		this.price = price;
		this.qty = qty;
		this.provider = provider;
		this.taker = taker;
		this.buyer = buyer;
		this.seller = seller;
		this.orderHit = orderHit; // the orderId of the order that was in the book
	}
	
	
	@Override
	public String toString() {
		return ("\n| TRADE\tt= " + timestamp + 
				"\tprice = " + price +
				"\tquantity = " + qty +
				"\tProvider = " + provider +
				"\tTaker = " + taker +
				"\tBuyer = " + buyer +
				"\tSeller = " + seller);
	}
	
	public String toCSV() {
		return (timestamp + ", " + 
				price + ", " + 
				qty + ", " + 
				provider + ", " + 
				taker + ", " + 
				buyer + ", " + 
				seller + "\n");
	}


	public int getTimestamp() {
		return timestamp;
	}



	public double getPrice() {
		return price;
	}



	public int getQty() {
		return qty;
	}



	public String getProvider() {
		return provider;
	}



	public String getTaker() {
		return taker;
	}



	public String getBuyer() {
		return buyer;
	}



	public String getSeller() {
		return seller;
	}


	public long getOrderHit() {
		return orderHit;
	}
}
