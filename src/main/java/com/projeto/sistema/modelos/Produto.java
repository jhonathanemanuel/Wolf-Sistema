package com.projeto.sistema.modelos;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Entity
public class Produto implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String codigoBarras;
    private String unidadeMedida;
    private Double estoque = 0.0;
    private Double precoCusto = 0.0;
    private Double precoVenda = 0.0;
    private Double lucro = 0.0;
    private Double margemLucro = 0.0;
}
