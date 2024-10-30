package com.colak.springtutorial.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MyRoute extends RouteBuilder {

    @Override
    public void configure() {
        from("timer://foo?period=1000")
                .setBody().constant("Hello from Camel!") // Set the message body
                .to("kafka:myInputTopic?brokers=localhost:9092")
                .to("log:bar");
    }
}
