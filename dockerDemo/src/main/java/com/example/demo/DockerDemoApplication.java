package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerDemoApplication {
	
	
	private static final Logger log = LoggerFactory.getLogger(DockerDemoApplication.class);

	@RequestMapping("/demo")
    public String home() {
		System.out.println("Serving client request...");		
		log.info("Logging the request");
		
        return "Hello Docker World "+Math.random()*10000+1;
    }

	public static void main(String[] args) {
		SpringApplication.run(DockerDemoApplication.class, args);
	}
}
