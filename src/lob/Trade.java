package lob;

public class Trade {
	private int timestamp;
	private double price;
	private int qty;
	private int provider;
	private int taker;
	private int buyer;
	private int seller;
	private int orderHit;
	
	public Trade(int time, double price, int qty, int provider, 
				 int taker, int buyer, int seller, int orderHit) {
		this.timestamp = time;
		this.price = price;
		this.qty = qty;
		this.provider = provider;
		this.taker = taker;
		this.buyer = buyer;
		this.seller = seller;
		this.orderHit = orderHit; // the qId of the order that was in the book
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



	public int getProvider() {
		return provider;
	}



	public int getTaker() {
		return taker;
	}



	public int getBuyer() {
		return buyer;
	}



	public int getSeller() {
		return seller;
	}


	public int getOrderHit() {
		return orderHit;
	}
}
