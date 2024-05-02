package com.pizzariaelastech.pizzaria.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPedido;
    @Column(length=30, nullable=false)
    private Date dataHora;
}
