package com.pkware.serverproductmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pkware.serverproductmanagement.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
