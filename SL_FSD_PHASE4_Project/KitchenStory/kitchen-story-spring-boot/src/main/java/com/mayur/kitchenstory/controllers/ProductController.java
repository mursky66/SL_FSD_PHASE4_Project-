package com.mayur.kitchenstory.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mayur.kitchenstory.models.Product;
import com.mayur.kitchenstory.services.ProductService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/products")
public class ProductController 
{
	@Autowired
	private ProductService service;
	
	@PostMapping
	public String addProduct(@RequestBody Product product)
	{
		service.addProduct(product);
		return "Product add success.";
	}
	
	@GetMapping
	public List<Product> getProducts()
	{
		List<Product> productlist = service.getAllProducts();
		return productlist;
	}
	
	@DeleteMapping("/delete/{prodId}")
	public String deleteProduct(@PathVariable("prodId") String prodId) {
		service.deleteProductById(prodId);
		return "Product delete success.";
	}
}
