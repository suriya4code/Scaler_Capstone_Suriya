package com.scaler.capstone.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.scaler.capstone.models.Product;
import com.scaler.capstone.services.ProductService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;

    ProductController(ProductService productService) {
        this.productService = productService;
    }
        
    @GetMapping("/{id}")
    public String getProducts(@RequestParam String id) {
        return "List of products";
    }
    
    @GetMapping
    public List<Product> getAllProducts(){
        return new ArrayList<Product>();
    }

    @PostMapping
    public Product createProduct(@RequestBody Product entity) {
                
        return entity;
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable("id") Long id,@RequestBody Product entity) {
                
        return entity;
    }

    @PatchMapping("/{id}")
    public Product patchProduct(@PathVariable("id") Long id,@RequestBody Product entity) {
                
        return entity;
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable("id") Long id) {
                
    }
    
}
