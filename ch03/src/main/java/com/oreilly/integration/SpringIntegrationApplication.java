package com.oreilly.integration;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.messaging.support.MessageBuilder;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@Configuration
@ImportResource("integration-context.xml")
public class SpringIntegrationApplication implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringIntegrationApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments arg0) {
        Map<String, Object> map = new HashMap<>();
        map.put("key", "value");

        MessageHeaders headers = new MessageHeaders(map);

        Message<String> message1 = new GenericMessage<>("Hello World!", headers);
        PrintService service = new PrintService();
        service.print(message1);

        Message<String> message2 = MessageBuilder
                .withPayload("Hello World, from the builder pattern")
                .setHeader("newHeader", "newHeaderValue").build();

        service.print(new GenericMessage<>("-------------"));
        service.print(message2);
	}
}
