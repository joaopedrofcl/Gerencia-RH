package com.api.api.funcionarios;
import java.time.LocalDate;


public record DadosCadastroFuncionario(
    String nome, 
    Cargo cargo,
    double salario,
    LocalDate data
    
) {
    
}
