package com.training.cloud.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootWebappApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootWebappApplication.class, args);
	}
	
	@GetMapping("/message")
	public String getMessage() {
		return "Hello from our Cloud Class!";
	}
	

}
