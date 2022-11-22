package org.sda.java19.util;

import org.sda.java19.models.Currency;
import org.sda.java19.models.Product;
import org.sda.java19.models.ProductCategory;
import org.sda.java19.models.Warehouse;

import java.util.List;

public class Data {

    public static Warehouse WAREHOUSE;

    public static List<Product> getInitialProducts() {
        Product product = new Product();
        product.setName("Apple");
        product.setProductCategory(ProductCategory.FRUITS);
        product.setPricePerItem(5.30f);
        product.setQuantity(10);
        product.setAvailable(true);
        product.setCurrency(Currency.EUR);



        Product product1 = new Product();
        product1.setName("Kalev");
        product1.setProductCategory(ProductCategory.CANDY);
        product1.setPricePerItem(0.35f);
        product1.setQuantity(100);
        product1.setAvailable(true);
        product1.setCurrency(Currency.EUR);

        return List.of(product, product1);
    };


}
