package com.pizzariaelastech.pizzaria.controller;

import com.pizzariaelastech.pizzaria.models.Cliente;
import com.pizzariaelastech.pizzaria.repositories.PizzariaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {
    @Autowired
    private PizzariaRepository pizzariaRepository;
    @RequestMapping(value = "/criacliente", method = RequestMethod.POST)
    public Cliente save
}
