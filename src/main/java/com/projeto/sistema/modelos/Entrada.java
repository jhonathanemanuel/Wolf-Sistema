package com.projeto.sistema.modelos;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@Entity
public class Entrada implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String obs;
    private Double valorTotal = 0.0;
    private Double quantidadeTotal = 0.0;
    private LocalDate dataEntrada = LocalDate.now();
    @ManyToOne
    private Fornecedor fornecedor;
    @ManyToOne
    private Funcionario funcionario;
}
