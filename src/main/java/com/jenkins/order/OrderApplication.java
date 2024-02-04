package com.jenkins.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrderApplication {

	public static void main(String[] args) {
		System.out.println("STarting Application Order-Service");
		SpringApplication.run(OrderApplication.class, args);
	}

}
