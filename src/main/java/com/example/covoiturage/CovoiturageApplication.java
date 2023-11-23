package com.example.covoiturage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.example.covoiturage")
public class CovoiturageApplication {

	public static void main(String[] args) {
		SpringApplication.run(CovoiturageApplication.class, args);
	}

}
