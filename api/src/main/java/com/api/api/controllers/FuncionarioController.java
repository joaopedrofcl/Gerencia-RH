package com.api.api.controllers;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.api.funcionarios.DadosCadastroFuncionario;
import com.api.api.funcionarios.FuncionarioRepository;
import com.api.api.funcionarios.Funcionarios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/cadastro")

public class FuncionarioController {
    @Autowired
    private FuncionarioRepository repository;

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroFuncionario dados){
        repository.save(new Funcionarios(dados));
        
    }
}
