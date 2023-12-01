package com.example.demo;


import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface  repository extends JpaRepository<cart, Long> {

Optional<cart> findByIdAndFetchProducts(Long id);
    
   
    Optional<cart> findByProducts_Id(Long productId);
    
}
