package com.oreilly.integration;

import org.springframework.messaging.Message;

public interface PrinterGateway {

	void print(Message<?> message);
	
}
