package com.skillsoft.springinitializr.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping(value = "/")
    public String index() {
        return "This is the main page";
    }

    @GetMapping(value = "/welcome")
    public String welcome() {
        return "Welcome to Spring Boot!";
    }

    @GetMapping(value = "/hello")
    public String hello() {
        return "Hello Spring Boot!";
    }
}