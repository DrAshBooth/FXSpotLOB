package unitTests;

import lob.*;

public class orderListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create an orderlist
		OrderList ol = new OrderList();
		
		// create and order
		Order o = new Order(999999999999999999L, 1, 1, "TRADEBOT", "bid", 1);
		
		// add order to orderList
		System.out.println("Add one order");
		ol.appendOrder(o);
		
		System.out.println(ol);
		
		System.out.println("Head order:");
		System.out.println(ol.getHeadOrder());
		System.out.println("Tail order:");
		System.out.println(ol.getTailOrder());
		System.out.println("Length:");
		System.out.println(ol.getLength());
		System.out.println("Volume:");
		System.out.println(ol.getVolume());
		
		// Add a second order
		System.out.println("Add a second order");
		ol.appendOrder(new Order(999999999999999998L, 2, 3, "HULL", "bid", 1.07891));
		System.out.println(ol);
		System.out.println("Head order:");
		System.out.println(ol.getHeadOrder());
		System.out.println("Tail order:");
		System.out.println(ol.getTailOrder());
		System.out.println("Length:");
		System.out.println(ol.getLength());
		System.out.println("Volume:");
		System.out.println(ol.getVolume());
		
		// Remove order
		System.out.println("Remove first order:");
		ol.removeOrder(o);
		System.out.println(ol);
		System.out.println("Head order:");
		System.out.println(ol.getHeadOrder());
		System.out.println("Tail order:");
		System.out.println(ol.getTailOrder());
		System.out.println("Length:");
		System.out.println(ol.getLength());
		System.out.println("Volume:");
		System.out.println(ol.getVolume());
		
	
	}

}
