package org.sample.erukea.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ErukeaSampleServerApplication {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(ErukeaSampleServerApplication.class, args);
	}

}
