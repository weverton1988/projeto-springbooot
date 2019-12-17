package com.weverton.projeto_web.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weverton.projeto_web.entities.Product;
import com.weverton.projeto_web.services.ProductService;

@RestController
@RequestMapping(value = "/products") // caminho do recurso "Product" colocar no plural
public class ProductResource { // Ele depende do ProductService

	@Autowired
	private ProductService service;
	
	@GetMapping
	public ResponseEntity<List<Product>> findAll() {
		List<Product> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
		public ResponseEntity<Product> findById(@PathVariable Long id ) {
		Product obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
