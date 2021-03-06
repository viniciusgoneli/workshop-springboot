package com.vallosstudio.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vallosstudio.workshop.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
