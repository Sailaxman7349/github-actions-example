package com.cicddemo.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CiCd1Application {

	@GetMapping("/welcome")
	public String welcome() {
		return "Hi this is sai";
	}

	public static void main(String[] args) {
		SpringApplication.run(CiCd1Application.class, args);
	}

}
