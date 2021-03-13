package com.saran.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping({ "/jwt" })
	public String firstPage() {
		return "Welcome to the world of Spring Boot JWT";
	}

}