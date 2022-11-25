package org.sda.java19.services.implementation;

import org.sda.java19.exceptions.WarehouseNotFoundException;
import org.sda.java19.models.Product;
import org.sda.java19.models.ProductCategory;
import org.sda.java19.models.Warehouse;
import org.sda.java19.services.ProductService;
import org.sda.java19.services.WarehouseService;
import org.sda.java19.util.Data;

import java.util.List;
import java.util.stream.Collectors;

import static com.sun.org.apache.xml.internal.serializer.Version.getProduct;

public class ProductServiceImpl implements ProductService {
    private final WarehouseService warehouseService = new WarehouseServiceImpl();

    @Override
    public void addProduct(Product product) {
        try {
            Warehouse warehouse = warehouseService.getWarehouse();
            List<Product> products = warehouse.getProducts();
            products.add(product);
            warehouse.setProducts(products);
            warehouseService.updateWarehouse(warehouse);

        } catch (WarehouseNotFoundException warehouseNotFoundException) {
            System.out.println(warehouseNotFoundException.getLocalizedMessage());
        }

    }

    @Override
    public void updateProduct(Product product) {

    }

    @Override
    public void deleteProductByName(String name) {

    }

    @Override
    public Product getProductByName(String name) {
        return null;
    }

    @Override
    public List<Product> getAllProductsByProductCategory(ProductCategory productCategory) throws WarehouseNotFoundException {
        return getAllProducts().stream()
                .filter(product -> productCategory.name().equals(productCategory.name()))
                .collect(Collectors.toList());
    }

    @Override
    public List<Product> getAllProducts() throws WarehouseNotFoundException {
        return warehouseService.getWarehouse().getProducts();
    }
}
