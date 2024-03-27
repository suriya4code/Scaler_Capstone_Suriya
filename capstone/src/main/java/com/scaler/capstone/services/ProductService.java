package com.scaler.capstone.services;

import java.util.List;

import com.scaler.capstone.models.Product;

public interface ProductService {

    Product getProductbyId(long id);
    
    List<Product> getAllProducts();

    Product createProduct(Product entity);

    Product updateProduct(long id, Product entity);

    Product patchProduct(long id, Product entity);

    void deleteProduct(long id);
} 
