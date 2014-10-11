package serverApp;

import java.net.*;
import java.io.*;
import lob.*;

public class ApplicationServer {

	public static void main(String[] args) throws IOException {
		
		// Create orderbook
    	OrderBook lob = new OrderBook(0.01);
		
		LobProtocol lp = new LobProtocol(lob);
		lp.processInput("action=limit qty=price price=130.891");
		
//		if (args.length != 1) {
//            System.err.println("Usage: java KnockKnockServer <port number>");
//            System.exit(1);
//        }
//
//        int portNumber = Integer.parseInt(args[0]);
//
//        try ( 
//        		// Set up the server socket
//	            ServerSocket serverSocket = new ServerSocket(portNumber);
//	            Socket clientSocket = serverSocket.accept();
//	            PrintWriter out =
//	                new PrintWriter(clientSocket.getOutputStream(), true);
//	            BufferedReader in = new BufferedReader(
//	                new InputStreamReader(clientSocket.getInputStream()));
//        ) {
//        	
//        	// Create orderbook
//        	OrderBook lob = new OrderBook(0.01);
//        
//        	// Initiate conversation with order book
//            String inputLine, outputLine;
//    
//            LobProtocol lobP = new LobProtocol(lob);
//            outputLine = lobP.processInput(null);
//            out.println(outputLine);
//
//            while ((inputLine = in.readLine()) != null) {
//                outputLine = lobP.processInput(inputLine);
//                out.println(outputLine);
//                if (outputLine.equals("Bye."))
//                    break;
//            }
//        } catch (IOException e) {
//            System.out.println("Exception caught when trying to listen on port "
//                + portNumber + " or listening for a connection");
//            System.out.println(e.getMessage());
//        }

	}

}
