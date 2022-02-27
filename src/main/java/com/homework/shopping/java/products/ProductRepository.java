package com.homework.shopping.java.products;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    List<Product> findByNameContainingIgnoreCase(String name);
}
