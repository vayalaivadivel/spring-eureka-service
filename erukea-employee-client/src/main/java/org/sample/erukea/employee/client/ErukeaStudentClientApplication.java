package org.sample.erukea.employee.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class ErukeaStudentClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ErukeaStudentClientApplication.class, args);
	}
	
	@RequestMapping("/")
	public String home() {
		return "Employee Service response";
	}
}
