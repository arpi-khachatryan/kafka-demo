package com.example.kafkademo.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "code", groupId = "groupId1")
    void listener(String data) {
        System.out.println("Listener received: " + data);
    }
}
