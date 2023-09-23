package com.cicdpipeline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class GithubCicdApplication {
	
	@GetMapping("/welcome")
	public String welcome()
	{
		return "Welcome to Docker";
	}

	public static void main(String[] args) {
		SpringApplication.run(GithubCicdApplication.class, args);
	}

}
