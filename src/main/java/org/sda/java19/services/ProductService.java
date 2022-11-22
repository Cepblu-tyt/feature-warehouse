package org.sda.java19.services;

import org.sda.java19.models.Product;
import org.sda.java19.models.ProductCategory;

import java.util.List;

/**
 *  Service to handle product related operations
 *
 * @author  Sergei Oksanen
 */
public interface ProductService {
    void addProduct(Product product);
    void updateProduct(Product product);
    void deleteProductByName(String name);
    Product getProductByName(String name);
    List<Product> getAllProductsByProductCategory(ProductCategory productCategory);
    List<Product> getAllProducts();

}
