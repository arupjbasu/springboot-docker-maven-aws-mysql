package org.Arup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootDockerMavenApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDockerMavenApplication.class, args);
	}

	@GetMapping("/Welcome")
	public String getMessage() {
		return "WELCOME ARUP TO DOCKER By MAVEN PUSH!!!!!!";
	}
}
