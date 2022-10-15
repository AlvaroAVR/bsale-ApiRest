package com.alvarovargas.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alvarovargas.model.Product;
import com.alvarovargas.service.ProductService;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

	private ProductService productService;
	
	public ProductController(ProductService productService) {
        this.productService = productService;
    }
	
	@GetMapping("/search")
    public ResponseEntity<List<Product>> searchProducts(@RequestParam("query") String query){
        return ResponseEntity.ok(productService.searchProducts(query));
    }
}
