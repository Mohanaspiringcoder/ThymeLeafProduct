package com.product.service;

import java.util.List;

import com.product.entity.Product;

public interface ProductService {
	List<Product> findAll();
	public void save(Product product);
	public Product findById(Integer id);
	public void deleteById(Integer id);
}
