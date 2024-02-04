package com.jenkins.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.jenkins")
public class OrderApplication {

	public static void main(String[] args) {
		System.out.println("STarting Application Order-Service");
		SpringApplication.run(OrderApplication.class, args);
	}

}
