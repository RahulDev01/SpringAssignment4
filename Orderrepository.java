package com.example.demo;
import com.example.ecommerce.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.time.LocalDateTime;


public interface OrderRepository extends JpaRepository<Order, Long> {
    
	List<Order> findByOrderDateBetween(LocalDateTime startDate, LocalDateTime endDate);
	
    List<Order> findByProducts_Name(String productName);
    
} 
