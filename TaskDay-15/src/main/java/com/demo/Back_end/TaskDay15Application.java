package com.demo.Back_end;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(value = "com.demo.entity.Student")
public class TaskDay15Application {

	public static void main(String[] args) {
		SpringApplication.run(TaskDay15Application.class, args);
	}

}
