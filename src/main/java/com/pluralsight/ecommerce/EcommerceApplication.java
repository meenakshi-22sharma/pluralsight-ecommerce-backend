package com.pluralsight.ecommerce;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EcommerceApplication implements CommandLineRunner {

//	@Value("${spring.port}")
//	private String port;

	@Value("${spring.datasource.url}")
	private String message;


//	public static void main(String[] args) {
//		SpringApplication.run(DemoApplication.class, args);
//
//	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println( message);
//		log.info("Resolved message port: {}", port);
//		log.info("Resolved message parameter: {}", message);


	}


	public static void main(String[] args) {
		SpringApplication.run(EcommerceApplication.class, args);
	}

}
