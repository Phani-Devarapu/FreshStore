package com.freshstore.application.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.freshstore.application.model.Product;
import com.freshstore.application.repository.ProductRepository;



	@RestController
	@CrossOrigin(origins="https://localhost:4200")
	@RequestMapping(path="Product")
	
	public class ProductController {
	 
		@Autowired
		private ProductRepository productRepository;
		
		@GetMapping("/getAll")
		public List<Product> getProduct(){
			return productRepository.findAll();                                               
		}
		@GetMapping("/get")
		public Optional<Product> getProductbyId(@RequestBody Long Product_ID){
			return productRepository.findById(Product_ID);                                               
		}
		
		
		@PostMapping("/post")
			public boolean postProduct(@RequestBody Product product){
				Product savedProduct = productRepository.save(product);
				return savedProduct !=null;
			}
		@PutMapping("/put")
		public boolean updateProduct(@RequestBody Product product)
		{
			Product updatedProduct=productRepository.save(product); 
			return updatedProduct !=null;
			
		}
		
		@DeleteMapping("/delete")
		public boolean deleteProduct(@RequestBody Product product) 
		{
			 productRepository.delete(product);
			return true;
		}
}
