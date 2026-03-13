package com.projeto.sistema.modelos;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@Entity
public class ItemEntrada implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Double quantidade;
    private Double valor;
    private Double valorCusto;

    @ManyToOne
    private Entrada entrada;
    @ManyToOne
    private Produto produto;
}
