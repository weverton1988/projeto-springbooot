package com.weverton.projeto_web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.weverton.projeto_web.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
