package com.example.demo;

import org.springframework.context.ApplicationEvent;

public class HelloEvent extends ApplicationEvent {

    private String greeting;

    public HelloEvent(Object source, String greeting) {
        super(source);
        this.greeting = greeting;
    }

    public String getGreeting() {
        return greeting;
    }
}
