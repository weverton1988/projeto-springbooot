package com.weverton.projeto_web.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weverton.projeto_web.entities.User;
import com.weverton.projeto_web.services.UserService;

@RestController
@RequestMapping(value = "/users") // caminho do recurso "User" colocar no plural
public class UserResource { // Ele depende do UserService

	@Autowired
	private UserService service;
	
	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
		public ResponseEntity<User> findById(@PathVariable Long id ) {
		User obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
