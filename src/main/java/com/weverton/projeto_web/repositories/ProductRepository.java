package com.weverton.projeto_web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.weverton.projeto_web.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
