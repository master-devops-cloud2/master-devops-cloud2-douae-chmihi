package com.example.lab_github_gates_douae_chmihi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Spring Boot!";
    }

    @GetMapping("/hi")
    public String Hi(){
        return "hi douae!!";
    }
}