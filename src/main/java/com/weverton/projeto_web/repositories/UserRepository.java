package com.weverton.projeto_web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.weverton.projeto_web.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
