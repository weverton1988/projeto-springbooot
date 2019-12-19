package com.weverton.projeto_web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.weverton.projeto_web.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
