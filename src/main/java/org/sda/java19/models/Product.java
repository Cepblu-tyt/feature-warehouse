package org.sda.java19.models;

import lombok.*;

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
    private float pricePerItem;
    private int quantity;
    private ProductCategory productCategory;
    private Currency currency;
    private boolean isAvailable;


}