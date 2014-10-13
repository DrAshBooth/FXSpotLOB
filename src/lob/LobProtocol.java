/*
 * The LOB Protocol
 * 
 * "Tag=Value" syntax
 * 
 * Tags:
 * 	- action
 * 	- 
 * 
 */


package lob;

import java.util.HashMap;

public class LobProtocol {
	private OrderBook lob;
	
	public LobProtocol(OrderBook lob) {
		this.lob = lob; 
	}
	
	public String processInput(int time, String inputString, boolean verbose) {
		
		String outputString = null;
		
		// Read input into a HashMap
		HashMap<String, String> messageMap = new HashMap<String, String>();
		String[] split = inputString.split(" ");
		for (String s : split) {
			String[] tempS = s.split("=");
			messageMap.put(tempS[0], tempS[1]);
		}
		
		if (!messageMap.containsKey("action")) {
			outputString = "Error, message must contain action";
		} else {
			String action = messageMap.get("action");
			switch (action) {
			case "market": {
				// Submit a market order to the LOB
				String side = messageMap.get("side");
				int qty = Integer.parseInt(messageMap.get("qty"));
				String takerId = messageMap.get("firmId");
				lob.processMarketOrder(time, side, qty, takerId, verbose);
				break;
				}
			case "limit": {
				// do limit stuff
				String side = messageMap.get("side");
				int qty = Integer.parseInt(messageMap.get("qty"));
				String firmId = messageMap.get("firmId");
				double price = Double.parseDouble(messageMap.get("price"));
				lob.processLimitOrder(time, side, qty, price, firmId, verbose);
				break;
			}
			case "cancel":
				// Cancel an order:
				int orderId = Integer.getInteger(messageMap.get("ordeId"));
				lob.cancelOrder(orderId);
				break;
			case "modify":
				// modify an order
				break;
			}
		}
		return outputString;
	}
}
