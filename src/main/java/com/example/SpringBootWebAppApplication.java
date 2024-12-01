package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@SpringBootApplication
public class SpringBootWebAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootWebAppApplication.class, args);
    }
}

@RestController
class GreetingController {
    private static final Logger logger = LoggerFactory.getLogger(GreetingController.class);

    @GetMapping("/greet")
    public String greet() {
        logger.info("Greet endpoint was called...");
        return "Hello, Welcome to Spring Boot!";
    }
}
