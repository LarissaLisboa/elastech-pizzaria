package com.pizzariaelastech.pizzaria.models;

import jakarta.persistence.*;

@Entity
public class BebidaPedida {
    @Column(length=30)
    private int quantidade;
}
