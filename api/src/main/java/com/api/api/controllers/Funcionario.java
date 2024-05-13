package com.api.api.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/cadastro")
public class Funcionario {
    @PostMapping
    public void cadastro(@RequestBody String json){
        System.out.println(json);
    }
}
