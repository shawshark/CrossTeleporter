package me.shawshark.crossteleporter;

import java.io.UnsupportedEncodingException;
import java.util.Collections;

import lilypad.client.connect.api.Connect;
import lilypad.client.connect.api.request.RequestException;
import lilypad.client.connect.api.request.impl.MessageRequest;

public class Request {

	static String channelName = "CrossTeleporter";
	static String slipt = "(.)";
	
	public static void send(String sender, String to, String fromServer) {

		Connect c = CrossTeleporter.connect;
		String message = sender + slipt + to + slipt + fromServer;
		
		try {
			
			MessageRequest request = 
					new MessageRequest(Collections.<String> emptyList(), channelName, message);
			
			c.request(request); 
			
		} catch (UnsupportedEncodingException | RequestException e) {
			e.printStackTrace();
		} 
	}
	
}
