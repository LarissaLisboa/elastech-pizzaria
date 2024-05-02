package com.pizzariaelastech.pizzaria.models;

import jakarta.persistence.*;

@Entity
public class Ingrediente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idIngrediente;
    @Column(length=30, nullable=false)
    private String nome;
    @Column(length=30, nullable=false)
    private double preco;

}
