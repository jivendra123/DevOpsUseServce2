package com.example.service2.service2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Service2Application {
	
    @Bean
    public RestTemplate getRestTemplate() {
    	return new RestTemplate();
    }
	public static void main(String[] args) {
		SpringApplication.run(Service2Application.class, args);
	}

}
