package com.oreilly.integration;

import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;

import java.util.Map.Entry;

public class PrintService {

	public Message<?> print(Message<String> message){
		MessageHeaders headers = message.getHeaders();
		
		for(Entry<String,Object> entry:headers.entrySet()){
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		System.out.println(message.getPayload());
		return MessageBuilder.withPayload("New Message").build();
	}
}
