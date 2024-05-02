package com.pizzariaelastech.pizzaria.models;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity

public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente;
    @Column(length=50, nullable=false)
    private String nome;
    @Column(length=30, nullable=false)
    private String telefone;
    @Column(length=30, nullable=false)
    private String endereco;
    @Column(length=30, nullable=false, unique = true)
    private String login;
    @Column(length=30, nullable=false)
    private String senha;
}
