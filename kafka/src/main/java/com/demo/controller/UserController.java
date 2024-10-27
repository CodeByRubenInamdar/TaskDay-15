package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.demo.model.User;
import com.demo.service.KafkaProducerService;

@RestController
@RequestMapping("/api/users")
public class UserController {

	@Autowired
	private KafkaProducerService kafkaProducerService;

	@PostMapping
	public String createUser(@RequestBody User user) {
		kafkaProducerService.sendMassage(user);
		return "User created successfully!";
	}
}
