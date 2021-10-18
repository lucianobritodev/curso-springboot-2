package com.lucianobrito.cursospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucianobrito.cursospring.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
