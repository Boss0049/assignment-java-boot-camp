package com.homework.shopping.java.carts;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carts")
public class CartController {
    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @PostMapping("/product")
    public ResponseEntity<Object> insertProduct(@RequestBody CartDTO cartBody) {
        Cart cart = cartService.insertProductToCart(cartBody);
        return ResponseEntity.status(HttpStatus.OK).body(cart);
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<Object> getCartByUserId(@PathVariable int userId) {
        List<Cart> carts = cartService.getCartListByUserId(userId);
        return ResponseEntity.status(HttpStatus.OK).body(carts);
    }
}
