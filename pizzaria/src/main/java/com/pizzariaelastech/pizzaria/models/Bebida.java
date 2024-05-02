package com.pizzariaelastech.pizzaria.models;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Bebida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBebida;
    @Column(length=30, nullable=false)
    private String nome;
    @Column(length=30, nullable=false)
    private double preco;


}