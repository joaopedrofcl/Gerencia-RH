package com.api.api.funcionarios;

import java.time.LocalDate;



public record DadosListadosFuncionario(
    Long id,
    String nome,
    Cargo cargo,
    double salario,
    LocalDate data) {
        public DadosListadosFuncionario(Funcionarios funcionarios){
            this(funcionarios.getId(), funcionarios.getNome(), funcionarios.getCargo(), funcionarios.getSalario(), funcionarios.getData());
        }
    
    
}
