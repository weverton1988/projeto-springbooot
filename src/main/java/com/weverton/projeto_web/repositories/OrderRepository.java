package com.weverton.projeto_web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.weverton.projeto_web.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
