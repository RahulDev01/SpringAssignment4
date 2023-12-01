package com.example.demo;


import com.example.ecommerce.Cart;
import com.example.ecommerce.Order;
import com.example.ecommerce.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
 
@Service

public class Orderservice {

    @Autowired
    private OrderRepository orderRepository;
 
    @Autowired
    private CartService cartService;
 
   
 
    public void placeOrder(Long cartId) {
        Cart cart = cartService.getCartById(cartId);
        if (cart != null && !cart.getProducts().isEmpty()) {
            Order order = new Order();
            order.setProducts(cart.getProducts());
            orderRepository.save(order);
 
            
            cart.getProducts().clear();
            cartService.saveCart(cart);
        }
    }
 
    public List<Order> viewOrderHistory() {
        return orderRepository.findAll();
    }
}

