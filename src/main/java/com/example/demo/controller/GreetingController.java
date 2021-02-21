package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping
    public String sayHello(@RequestParam(required = false, defaultValue = "world") String name) {
        return String.format("Hello, %s!", name);
    }
}