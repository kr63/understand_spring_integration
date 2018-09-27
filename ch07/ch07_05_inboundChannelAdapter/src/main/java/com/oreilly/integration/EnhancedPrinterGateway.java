package com.oreilly.integration;

import org.springframework.util.concurrent.ListenableFuture;

public interface EnhancedPrinterGateway {

	void print(Person person);
	
	ListenableFuture<String> uppercase(Person person);
	
}
