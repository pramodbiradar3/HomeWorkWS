package com.homework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages="com.homework.repositories")
public class HomeWorkApplication {
	public static void main(String[] args) {
		SpringApplication.run(HomeWorkApplication.class, args);
	}
}
