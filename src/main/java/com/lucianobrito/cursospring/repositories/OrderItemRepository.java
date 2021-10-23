package com.lucianobrito.cursospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucianobrito.cursospring.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
