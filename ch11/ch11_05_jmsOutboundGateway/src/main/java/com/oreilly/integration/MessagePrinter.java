package com.oreilly.integration;

import org.springframework.messaging.Message;

public class MessagePrinter {

    public String print(Message<?> message) {
        System.out.println("Printing the message: ");
        return "From the inbound gateway: 1 message worked";
    }

    public void printConsole(Message<?> message) {
        System.out.println("Message was passed to printConsole from the outboundGateway");
        System.out.println(message);
    }
}
