package com.pkware.serverproductmanagement.service;

import java.util.List;

import com.pkware.serverproductmanagement.model.Product;

public interface ProductService {
    Product saveProduct(Product product);

    Product updateProduct(Product product);

    void deleteProduct(Long productId);

    Long numberOfProducts();

    List<Product> findAllProducts();
}
