package com.projeto.sistema.modelos;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Entity
public class ItemVenda implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Double quantidade;
    private Double valor;
    private Double subtotal;

    @ManyToOne
    private Venda venda;
    @ManyToOne
    private Produto produto;
}
