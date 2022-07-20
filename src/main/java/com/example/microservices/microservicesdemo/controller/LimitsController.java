package com.example.microservices.microservicesdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.microservices.microservicesdemo.bean.Limits;
import com.example.microservices.microservicesdemo.configuration.Configuration;

@RestController
public class LimitsController {
    
    @Autowired
    private Configuration configuration;

    @GetMapping ("/limits")
    public com.example.microservices.microservicesdemo.bean.Limits retrieveLimits() {
        return new Limits(configuration.getMinimum(), configuration.getMaximum());
        //return new Limits(1,1000);
    }
}
