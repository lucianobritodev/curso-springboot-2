package com.lucianobrito.cursospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucianobrito.cursospring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
