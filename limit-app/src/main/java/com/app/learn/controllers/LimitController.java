package com.app.learn.controllers;

import com.app.learn.configs.ConfigProperties;
import com.app.learn.models.Limit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitController {

    @Autowired
    ConfigProperties configProperties;

    @GetMapping("/limits")
    public Limit retrieveLimit() {
        return new Limit(configProperties.getMinimum(), configProperties.getMaximum());
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello";
    }

}
