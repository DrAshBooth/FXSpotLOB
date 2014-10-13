package unitTests;

import lob.*;

public class orderTreeTest {

	public static void main(String[] args) {
		
		OrderTree bidBook = new OrderTree();
		OrderTree askBook = new OrderTree();

		// Add a bunch of orders
		bidBook.insertOrder(1, 100, "GETCO", "buy", 00000, 100.01);
		bidBook.insertOrder(2, 1000, "GETCO", "buy", 00001, 100.02);
		bidBook.insertOrder(3, 200, "GETCO", "buy", 00002, 99);
		bidBook.insertOrder(4, 1, "GETCO", "buy", 00003, 100.01);
		
		System.out.println(bidBook);
		
		// Try adding order of qty zero
		try {
			bidBook.insertOrder(5, 0, "GETCO", "buy", 00004, 100.01);
			System.out.println(bidBook);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		// zero price
		
		// negative price
	}

}
