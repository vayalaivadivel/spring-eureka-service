package org.sample.erukea.student.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class ErukeaStudentClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ErukeaStudentClientApplication.class, args);
	}

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/")
	public String home() {
		final String response = restTemplate.getForObject("http://employee-service/", String.class);
		final StringBuilder responseBuilder = new StringBuilder("Response from employee-service: ");
		responseBuilder.append(response);
		responseBuilder.append(" And Student Response: Student Service response");

		return responseBuilder.toString();
	}

	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
