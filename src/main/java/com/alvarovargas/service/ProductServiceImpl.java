package com.alvarovargas.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.alvarovargas.model.Product;
import com.alvarovargas.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	private ProductRepository productRepository;
	
	public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
	
	@Override
	public List<Product> searchProducts(String query) {
		List<Product> products = productRepository.searchProducts(query);
        return products;
	}

}
