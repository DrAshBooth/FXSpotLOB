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
	
	public String processInput(String inputString) {
		
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
			case "market":
				// do market stuff
				String side = messageMap.get("side");
				int qty = Integer.parseInt(messageMap.get("qty"));
				break;
			case "limit":
				// do limit stuff
				break;
			case "cancel":
				// cancel an order:
				break;
			case "modify":
				// modify an order
				break;
			}
		}
		return outputString;
	}
}
