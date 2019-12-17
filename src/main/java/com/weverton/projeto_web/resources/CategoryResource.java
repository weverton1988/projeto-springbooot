package com.weverton.projeto_web.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weverton.projeto_web.entities.Category;
import com.weverton.projeto_web.services.CategoryService;

@RestController
@RequestMapping(value = "/categories") // caminho do recurso "Category" colocar no plural
public class CategoryResource { // Ele depende do CategoryService

	@Autowired
	private CategoryService service;
	
	@GetMapping
	public ResponseEntity<List<Category>> findAll() {
		List<Category> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
		public ResponseEntity<Category> findById(@PathVariable Long id ) {
		Category obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
