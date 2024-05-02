package com.pizzariaelastech.pizzaria.models;

import jakarta.persistence.*;

@Entity
public class Fornada {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFornada;
    @Column(length=30, nullable=false)
    private int numFornada;
    @Column(length=30, nullable=false)
    private int qtdPizzas;
}
