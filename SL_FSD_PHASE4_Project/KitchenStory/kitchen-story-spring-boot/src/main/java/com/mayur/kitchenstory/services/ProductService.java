package com.mayur.kitchenstory.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mayur.kitchenstory.models.Product;
import com.mayur.kitchenstory.repository.ProductRepository;


@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	public void addProduct(Product product)
	{
		repository.save(product);
	}
	
	public List<Product> getAllProducts()
	{
		return repository.findAll();
	}
	
	public Optional<Product> getProductById(String id)
	{
		return repository.findById(id);
	}
	
	public void deleteProductById(String id)
	{
		repository.deleteById(id);
	}
}
