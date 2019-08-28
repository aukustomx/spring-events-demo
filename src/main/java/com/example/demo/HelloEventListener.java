package com.example.demo;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class HelloEventListener {

    @EventListener
    public void onHelloEvent(HelloEvent e) {
        String threadName = Thread.currentThread().getName();
        System.out.println("En manejador de evento Hello: " + e.getGreeting() + ": " + threadName);
    }

    @EventListener
    public void onHelloEventForNotification(HelloEvent e) {
        String threadName = Thread.currentThread().getName();
        System.out.println("Enviando correo desde el manejador de evento Hello: " + e.getGreeting() + ": " + threadName);
    }

    @EventListener
    public void onHelloCrashEvent(HelloCrashEvent e) {
        String threadName = Thread.currentThread().getName();
        System.out.println("Todo valió chetos " + ": " + threadName);
    }

    @Async
    @EventListener
    public void onHelloCrashEventAsync(HelloCrashEvent e) {
        String threadName = Thread.currentThread().getName();
        System.out.println("Indicando que odo valió chetos, asíncronamente claro" + ": " + threadName);
    }
}
