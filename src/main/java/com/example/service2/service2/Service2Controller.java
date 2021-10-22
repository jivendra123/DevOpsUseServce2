package com.example.service2.service2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/service2")
public class Service2Controller {
	@Autowired
	RestTemplate rest;
	@GetMapping("/test")
	public String test1() {
		return "test1 method of service2";
		}
	@GetMapping("/getTest1")
	public String gettest1() {
		String url=rest.getForObject("http://localhost:8082/service1/test1/",String.class);
		return url;
	}

}
