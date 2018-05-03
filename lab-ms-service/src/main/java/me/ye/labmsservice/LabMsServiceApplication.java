package me.ye.labmsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
public class LabMsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabMsServiceApplication.class, args);
	}
}
