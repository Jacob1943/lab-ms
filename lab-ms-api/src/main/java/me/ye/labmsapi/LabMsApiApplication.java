package me.ye.labmsapi;

import me.ye.lab.ms.common.annotation.EnableApiDoc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableApiDoc
@EnableFeignClients
@SpringBootApplication
public class LabMsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabMsApiApplication.class, args);
	}
}
