package me.ye.labmsapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients
@SpringBootApplication
public class LabMsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabMsApiApplication.class, args);
	}
}
