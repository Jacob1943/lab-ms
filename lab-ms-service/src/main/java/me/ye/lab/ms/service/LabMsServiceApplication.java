package me.ye.lab.ms.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@EnableMongoAuditing
@SpringBootApplication
public class LabMsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabMsServiceApplication.class, args);
	}
}
