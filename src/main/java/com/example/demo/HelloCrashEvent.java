package com.example.demo;

import org.springframework.context.ApplicationEvent;

public class HelloCrashEvent extends ApplicationEvent {

    public HelloCrashEvent(Object source) {
        super(source);
    }
}
