package com.homework.shopping.java.products;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> searchProducts(String name) {
        return productRepository.findByNameContainingIgnoreCase(name);
    }

    public Optional<Product> getProductById(int id) {
        return productRepository.findById(id);
    }
}
