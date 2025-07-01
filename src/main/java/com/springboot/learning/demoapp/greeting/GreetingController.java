package com.springboot.learning.demoapp.greeting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello Intern! Welcome to Spring Boot Java.";
    }
    
}
