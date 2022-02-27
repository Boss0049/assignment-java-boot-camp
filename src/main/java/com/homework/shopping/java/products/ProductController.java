package com.homework.shopping.java.products;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public ResponseEntity<Object> searchProducts(@RequestParam String name) {
        List<Product> products = productService.searchProducts(name);
        return ResponseEntity.status(HttpStatus.OK).body(products);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getProductById(@PathVariable int id) {
        Optional<Product> product = productService.getProductById(id);
        return ResponseEntity.status(HttpStatus.OK).body(product);
    }
}
