package com.pizzariaelastech.pizzaria.models;

import jakarta.persistence.*;

@Entity
public class Tamanho {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTamanho;
    @Column(length=30, nullable=false)
    private String nome;
    @Column(length=30)
    private double desconto;
}
