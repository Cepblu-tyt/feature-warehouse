package org.sda.java19.services;

import org.sda.java19.exceptions.WarehouseNotFoundException;
import org.sda.java19.models.Product;
import org.sda.java19.models.ProductCategory;

import java.util.List;
import java.util.Optional;

/**
 *  Service to handle product related operations
 *
 * @author  Sergei Oksanen
 */
public interface ProductService {
    void addProduct(Product product);
    void updateProduct(Product product);
    void deleteProductByName(String name) throws WarehouseNotFoundException;

    /**
     * To get a product by its name from warehouse
     * @param name name of the product
     * @return Product
     */
    Optional<Product> getProductByName(String name) throws WarehouseNotFoundException;

    /**
     * To get a lis tof all products from the warehouse by a given product category
     * @param productCategory product category
     * @return list of products
     */
    List<Product> getAllProductsByProductCategory(ProductCategory productCategory) throws WarehouseNotFoundException;


    /**
     * To get all products from the warehouse
     * @return list of products
     */
    List<Product> getAllProducts() throws WarehouseNotFoundException;
}