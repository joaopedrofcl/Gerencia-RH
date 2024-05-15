package com.api.api.funcionarios;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="funcionarios")
@Table(name="Funcionarios")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")

public class Funcionarios{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome; 
    @Enumerated(EnumType.STRING)
    private Cargo cargo;
    private double salario;
    private LocalDate data;

    
    public Funcionarios(DadosCadastroFuncionario dados) {
        this.nome = dados.nome();
        this.cargo = dados.cargo();
        this.salario = dados.salario();
        this.data = dados.data();
}
    public void atualizarInformacoes(@Valid DadosAtualizarFuncionario dados){
        if(dados.nome() != null){
            this.nome = dados.nome();
        }
        if(dados.cargo() != null){
            this.cargo = dados.cargo();
        }
        if (dados.salario() > 0) {
            this.salario = dados.salario();
        }
        if(dados.data() != null){
            this.data = dados.data();
        }
        

    }
}

