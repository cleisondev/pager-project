package com.cleison.nunes.pager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories()
public class PagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PagerApplication.class, args);
	}

}
