package com.musidequestersguild.sidequestengine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SidequestengineApplication {

	@GetMapping()

	public static void main(String[] args) {
		SpringApplication.run(SidequestengineApplication.class, args);
	}

}
