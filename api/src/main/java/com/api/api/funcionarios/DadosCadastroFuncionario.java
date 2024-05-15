package com.api.api.funcionarios;
import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;





public record DadosCadastroFuncionario(
    @NotBlank
    String nome,
    @NotNull 
    Cargo cargo,
    @NotNull
    double salario,
    @PastOrPresent
    LocalDate data
    
) {
    
}
