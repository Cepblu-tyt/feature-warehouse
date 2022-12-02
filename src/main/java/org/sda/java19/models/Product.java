package org.sda.java19.models;

import lombok.*;

import java.math.BigDecimal;

/**
 * Product should have: pricePerItem, name, quantity, product category, currency, isAvailable
 */
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Setter
@Getter
@Data

public class Product {

    private String name;
    private BigDecimal price;
    private int quantity;
    private ProductCategory productCategory;
    private Currency currency;
    private boolean isAvailable;


}