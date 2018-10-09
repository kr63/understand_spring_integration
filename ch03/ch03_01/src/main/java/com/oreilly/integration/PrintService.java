package com.oreilly.integration;

import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;

import java.util.Map.Entry;

class PrintService {
    void print(Message<String> message) {
        MessageHeaders headers = message.getHeaders();

        System.out.println("Headers: \n");
        for (Entry<String, Object> entry : headers.entrySet()) {
            System.out.println("Key: " + entry.getKey());
            System.out.println("Value: " + entry.getValue());
        }
        System.out.println("\nPayload: " + message.getPayload());
    }
}
