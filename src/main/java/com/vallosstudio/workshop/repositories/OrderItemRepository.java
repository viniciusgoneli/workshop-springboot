package com.vallosstudio.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vallosstudio.workshop.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
