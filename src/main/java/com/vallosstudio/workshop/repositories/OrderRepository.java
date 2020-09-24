package com.vallosstudio.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vallosstudio.workshop.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
