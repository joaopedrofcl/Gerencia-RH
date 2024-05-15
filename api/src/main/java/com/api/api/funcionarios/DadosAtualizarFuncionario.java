package com.api.api.funcionarios;

import java.time.LocalDate;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizarFuncionario(
    @NotNull
    Long id,
    String nome,
    Cargo cargo,
    double salario,
    LocalDate data) {

}
