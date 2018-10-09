package com.oreilly.integration;


import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;

public interface FileWriterGateway {

    void write(@Header("fileName") String fileName,
               @Payload String message);

    void read(String filename);
}
