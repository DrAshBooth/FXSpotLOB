package lob;

public class Order {
	private int timestamp;
	private int quantity;
	private String side;
	private double price;
	private long orderId;
	private int firmId;
	private Order nextOrder;
	private Order prevOrder;
	private OrderList oL;

	public Order(long orderId, int time, int quantity, int firmId, String side, double price) {
		this.orderId = orderId;
		this.timestamp = time;
		this.side = side;
		this.quantity = quantity;
		this.price = price;
		this.firmId = firmId;
	}
	
	public void updateQty(int qty, int tstamp) {
		if ((qty > this.quantity) && (this.oL.getTailOrder() != this)) {
			// Move order to the end of the list. i.e. loses time priority
			this.oL.moveTail(this);
			this.timestamp = tstamp;
		}
		oL.setVolume(oL.getVolume()-(this.quantity-qty));
		this.quantity = qty;
	}
	
	public String toString() {
        return Integer.toString(quantity) + "\t@\t" + Double.toString(price) + 
        		"\tt=" + Integer.toString(timestamp) + 
        		"\torderId=" + Long.toString(orderId) +
        		"\tfirmId=" + Integer.toString(firmId);
    }

	
	// Getters and Setters
	public Order getNextOrder() {
		return nextOrder;
	}

	public void setNextOrder(Order nextOrder) {
		this.nextOrder = nextOrder;
	}

	public Order getPrevOrder() {
		return prevOrder;
	}

	public void setPrevOrder(Order prevOrder) {
		this.prevOrder = prevOrder;
	}

	public Integer getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(int timestamp) {
		this.timestamp = timestamp;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getFirmId() {
		return firmId;
	}

	public void setFirmId(int firmId) {
		this.firmId = firmId;
	}

	public OrderList getoL() {
		return oL;
	}

	public String getSide() {
		return side;
	}

	public void setoL(OrderList oL) {
		this.oL = oL;
	}
}
