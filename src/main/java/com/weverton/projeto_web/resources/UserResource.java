package com.weverton.projeto_web.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weverton.projeto_web.entities.User;

@RestController
@RequestMapping(value = "/users") // caminho do recurso "User" colocar no plural
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1l, "Maria", "maria@gmail.com", "999999", "1234");	
		return ResponseEntity.ok().body(u);
	}
}
