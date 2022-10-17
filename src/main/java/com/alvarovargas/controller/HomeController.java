package com.alvarovargas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alvarovargas.model.Product;
import com.alvarovargas.service.ProductService;

@RestController
@RequestMapping("/api/v1/products")
public class HomeController {

	@Autowired
	private ProductService productService;
	
	@GetMapping("/todos")
    public ResponseEntity<List<Product>> todos(){
    	return ResponseEntity.ok(productService.listarProductos());
    }
    
    @GetMapping("/buscar")
    public ResponseEntity<List<Product>> buscarProductos(@RequestParam("query") String query){
    	return ResponseEntity.ok(productService.buscarProductos(query));
    }
}
