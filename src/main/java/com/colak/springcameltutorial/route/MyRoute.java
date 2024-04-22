package com.colak.springcameltutorial.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MyRoute extends RouteBuilder {

    @Override
    public void configure() {
        from("timer:foo").to("log:bar");
    }
}
