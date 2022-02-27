package com.homework.shopping.java.carts;

import com.homework.shopping.java.products.Product;
import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Cart {

    @Id
    @GeneratedValue
    private int id;
    private int userId;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "productId", nullable = false)
    private Product product;

    private int amount;

}
