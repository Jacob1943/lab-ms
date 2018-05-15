package me.ye.lab.ms.service;

import me.ye.lab.ms.common.config.SequenceGeneratorConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@EnableMongoAuditing
@SpringBootApplication
@Import(SequenceGeneratorConfig.class)
public class LabMsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabMsServiceApplication.class, args);
	}
}
