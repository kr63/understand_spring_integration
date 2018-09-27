package com.oreilly.integration;

import org.springframework.messaging.Message;

import java.util.Map.Entry;

public class PrintService {

	public void print(Message<String> message) {
		System.out.println(message.getPayload() + " 12345");
		
		for(Entry<String,Object> entry:message.getHeaders().entrySet()){
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}

}
