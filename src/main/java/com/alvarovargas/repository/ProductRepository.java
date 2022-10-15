package com.alvarovargas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.alvarovargas.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	@Query("SELECT p FROM Product p WHERE " +
            "p.name LIKE CONCAT('%',:query, '%')"+
            "Or p.id LIKE CONCAT('%',:query, '%')")
    List<Product> searchProducts(String query);
}