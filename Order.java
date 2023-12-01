package com.example.demo;
import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
 
@Entity
public class Order {
      @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
 
    @ManyToMany
    private List<Product> products;
 
    private LocalDateTime orderDate;
 
    // Constructors
 
    public Order() {
        // Default constructor
    }
 
    // Getters and Setters
 
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
this.id = id;
    }
 
    public List<Product> getProducts() {
        return products;
    }
 
    public void setProducts(List<Product> products) {
        this.products = products;
    }
 
    public LocalDateTime getOrderDate() {
        return orderDate;
    }
 
    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }
 
    
}


