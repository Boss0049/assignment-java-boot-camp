package com.homework.shopping.java.products;

public class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException(String name) {
        super(name);
    }
}
