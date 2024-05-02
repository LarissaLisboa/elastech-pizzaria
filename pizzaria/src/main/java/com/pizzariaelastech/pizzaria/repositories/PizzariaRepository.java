package com.pizzariaelastech.pizzaria.repositories;

import com.pizzariaelastech.pizzaria.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzariaRepository extends JpaRepository<Cliente, Long> {
}
