package com.product.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.entity.Product;
import com.product.repository.ProductRepository;

@Service
public class ProductServiceImplementation implements ProductService{

	@Autowired
	ProductRepository productRepository;
	
	public List<Product> findAll() {
		return productRepository.findAll();
	}

	
	public void save(Product product) {
		productRepository.save(product);
		
	}

	
	public Product findById(Integer id) {
		Optional<Product> result = productRepository.findById(id);
		Product product = null;
		
		if(result.isPresent()) 
			product = result.get();
		return product;
	}

	
	public void deleteById(Integer id) {
		productRepository.deleteById(id);
		
	}

}
