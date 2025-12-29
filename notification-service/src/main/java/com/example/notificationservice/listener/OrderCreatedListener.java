package com.example.notificationservice.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class OrderCreatedListener {

    @KafkaListener(topics = "order.created", groupId = "notification-group")
    public void consume(String message) {
        System.out.println("Order created: " + message);
    }
}
