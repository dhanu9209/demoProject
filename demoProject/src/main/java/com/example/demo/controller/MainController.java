package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class MainController {

	@GetMapping("/")
	public String testMethod() {
		return "Hello World from local repository";
	}
	
}
