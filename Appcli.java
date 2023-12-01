package com.example.demo;
import com.example.ecommerce.Product;
import com.example.ecommerce.ProductService;
import com.example.ecommerce.CartService;
import com.example.ecommerce.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
 
import java.util.List;
import java.util.Scanner;
 
@Component

public class Appcli {
        @Autowired
    private ProductService productService;
 
    @Autowired
    private CartService cartService;
 
    @Autowired
    private OrderService orderService;
 
    public void run() {
Scanner scanner = new Scanner(System.in);
        int choice;
 
        do {
            System.out.println("Choose an option:");
            System.out.println("1. List all products");
            System.out.println("2. Add a product to the cart");
            System.out.println("3. View cart");
            System.out.println("4. Place an order");
            System.out.println("5. View order history");
            System.out.println("6. Exit");
 
            choice = scanner.nextInt();
 
            switch (choice) {
                case 1:
                    listAllProducts();
                    break;
                case 2:
                    addProductToCart();
                    break;
                case 3:
                    viewCart();
                    break;
                case 4:
                    placeOrder();
                    break;
                case 5:
                    viewOrderHistory();
                    break;
                case 6:
                    System.out.println("Exiting the application. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
 
        } while (choice != 6);
    }
 
    private void listAllProducts() {
        List<Product> products = productService.listAllProducts();
        System.out.println("List of all products:");
        for (Product product : products) {
            System.out.println("ID: " + product.getId() + ", Name: " + product.getName() +
                    ", Price: " + product.getPrice());
        }
    }
    private void addProductToCart() {
        System.out.println(productService.getId());
    }
 
    private void viewCart() {
        System.out.println(cartService.getProducts());
    }
 
    private void placeOrder() {
        System.out.println(productService.listAllProducts());
    }
 
    private void viewOrderHistory() {
    	System.out.println(orderService.viewOrderHistory());
    	
    }
 
}

