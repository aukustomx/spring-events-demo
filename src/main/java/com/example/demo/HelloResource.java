package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloResource {

    @Autowired
    private ApplicationEventPublisher publisher;

    @GetMapping
    public String hello() {

        HelloEvent event = new HelloEvent(this, "Hola desde el controller");
        publisher.publishEvent(event);

        publisher.publishEvent(new HelloCrashEvent(this));
        return "Hello World!";
    }
}
