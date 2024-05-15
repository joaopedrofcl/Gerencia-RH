package com.api.api.controllers;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.api.funcionarios.DadosAtualizarFuncionario;
import com.api.api.funcionarios.DadosCadastroFuncionario;
import com.api.api.funcionarios.DadosListadosFuncionario;
import com.api.api.funcionarios.FuncionarioRepository;
import com.api.api.funcionarios.Funcionarios;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;






@RestController
@RequestMapping("/cadastro")

public class FuncionarioController {
    @Autowired
    private FuncionarioRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroFuncionario dados){
        repository.save(new Funcionarios(dados));
    }
    

    @GetMapping
   public List<DadosListadosFuncionario> listar(){
    return repository.findAll().stream().map(DadosListadosFuncionario::new).toList();
}
    @PutMapping
    public void atualizar(@RequestBody @Valid DadosAtualizarFuncionario dados){
    var funcionarios = repository.getReferenceById(dados.id());
    funcionarios.atualizarInformacoes(dados);
    repository.save(funcionarios);
    } 
    @DeleteMapping("/{id}")
    @Transactional
    public void excluir(@PathVariable Long id){
    repository.deleteById(id);
}

}



    
