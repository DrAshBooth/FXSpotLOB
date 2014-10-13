package unitTests;

import lob.*;

public class orderTests {

	public static void main(String[] args) {
		
		//Order o = new Order(orderId, time, quantity, firmId, side, price)

		
		Order o = new Order(999999999999999999L, 1, 1, "GETCO", "bid", 1);
		
		System.out.println(o);
		
		System.out.println(o.getOrderId());
		System.out.println(o.getTimestamp());
		System.out.println(o.getQuantity());
		System.out.println(o.getFirmId());
		System.out.println(o.getSide());
		System.out.println(o.getPrice());
		
	}
	
}
