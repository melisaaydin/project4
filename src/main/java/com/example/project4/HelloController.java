package com.example.project4;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Hello from Spring Boot on Kubernetes! - Project4";
    }

    @GetMapping("/health")
    public String health() {
        return "OK";
    }
}