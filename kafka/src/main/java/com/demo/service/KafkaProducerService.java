package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.demo.model.User;

@Service
public class KafkaProducerService {
	@Autowired
	private KafkaTemplate<String, User> kafkaTemplate;
	


	private static final String TOPIC = "user-topic";

	public void sendMassage(User user) {
		kafkaTemplate.send(TOPIC, user);
	}



	

}
