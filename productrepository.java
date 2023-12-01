package com.example.demo;
import com.example.ecommerce.*;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public class productrepository  extends JpaRepository<Product, Long> {
    
    
    List<Product> findByName(String name);
    
    List<Product> findByPriceLessThan(Double price);
    
    
    List<Product> findByStockGreaterThan(Integer stock);
    
} 
