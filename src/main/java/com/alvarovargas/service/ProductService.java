package com.alvarovargas.service;

import java.util.List;

import com.alvarovargas.model.Product;

public interface ProductService {
	List<Product> searchProducts(String query);
}
