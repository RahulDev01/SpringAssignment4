package com.example.demo;

import com.example.ecommerce.*;
import com.example.ecommerce.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
 
@Service

public class productservice {
    @Autowired
    private ProductRepository productRepository;
 
    // CRUD operations
 
    public List<product> listAllProducts() {
        return productRepository.findAll();
    }
 
    public Optional<product> getProductById(Long productId) {
        return productRepository.findById(productId);
    }
 
    public Product saveProduct(product product) {
        return productRepository.save(product);
    }
 
    public void deleteProduct(Long productId) {
        productRepository.deleteById(productId);
    }

	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}
}


