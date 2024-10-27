package com.demo.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.demo.model.User;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "user-topic", groupId = "kafka-group", containerFactory = "kafkaListenerContainerFactory")
    public void consume(User user) {
        System.out.println("Consumed message: " + user);
    }

}
