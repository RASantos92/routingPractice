package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CodingController {

	@RequestMapping("/")
	public String hello() {
		return "Hello";
	}

	@RequestMapping("/coding")
	public String coding() {
		return "Hello coding dojo";
	}

	@RequestMapping("/coding/python")
	public String python() {
		return "Python/Django was awesome!";
	}

	@RequestMapping("/coding/java")
	public String java() {
		return "Python/Django was awesome!";
	}
}