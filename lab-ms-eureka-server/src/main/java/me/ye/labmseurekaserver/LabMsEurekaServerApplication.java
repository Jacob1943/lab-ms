package me.ye.labmseurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class LabMsEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabMsEurekaServerApplication.class, args);
	}
}
