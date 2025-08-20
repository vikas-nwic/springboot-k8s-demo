package com.kubernete.springboot_k8s_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootK8sDemoApplication {

	@GetMapping("/msg")
	public String welcome(){
		return "Congratulation you successfully deployed your spring boot application on kubernetes 😊😊😊😊";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootK8sDemoApplication.class, args);
	}

}
