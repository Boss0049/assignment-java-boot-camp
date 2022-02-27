package com.homework.shopping.java.products;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Product {

    @Id
    private int id;
    private String name;
    private double price;
}
