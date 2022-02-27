package com.homework.shopping.java.carts;

import com.homework.shopping.java.products.Product;
import com.homework.shopping.java.products.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CartService {

    private final CartRepository cartRepository;

    private final ProductService productService;

    public CartService(CartRepository cartRepository, ProductService productService) {
        this.cartRepository = cartRepository;
        this.productService = productService;
    }

    public List<Cart> getCartListByUserId(int userId) {
        return cartRepository.findByUserId(userId);
    }

    public Cart insertProductToCart(CartDTO cartDTO) {
        Optional<Product> product = productService.getProductById(cartDTO.getProductId());

        Cart cart = new Cart();
        cart.setUserId(cartDTO.getUserId());
        cart.setAmount(cartDTO.getAmount());
        cart.setProduct(product.get());
        return cartRepository.save(cart);
    }
}
