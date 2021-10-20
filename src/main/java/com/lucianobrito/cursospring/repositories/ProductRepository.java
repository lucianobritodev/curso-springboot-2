package com.lucianobrito.cursospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucianobrito.cursospring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
