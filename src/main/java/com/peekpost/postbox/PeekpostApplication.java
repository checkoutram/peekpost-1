package com.peekpost.postbox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PeekpostApplication {

	public static void main(String[] args) {
		SpringApplication.run(PeekpostApplication.class, args);
		System.out.println("server startup");
	}
}
