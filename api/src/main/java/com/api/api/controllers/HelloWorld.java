package com.api.api.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/hello")
public class HelloWorld {
    @GetMapping
    public String olaMundo(){
        return "Olá mundo";

    }
    
}
