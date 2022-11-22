package org.sda.java19;

import org.sda.java19.models.ProductCategory;
import org.sda.java19.models.Warehouse;
import org.sda.java19.services.WarehouseService;
import org.sda.java19.services.implementation.WarehouseServiceImpl;
import org.sda.java19.util.Data;

import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 2. Warehouse
 * a. User should be able to: add, display all of the details, update, delete an item
 * b. Use composition (class inside a class) and collections (The warehouse has products/items)
 * c. Add possibility to display summaries, like sum of all of the products, their prices.
 * d. *Add possibility to update number of items in a specific way, e.g.:
 * "pliers:30"
 * "scissors:+4"
 */
public class Main {

    private static final Scanner SCANNER = new Scanner(System.in);


    public static void main(String[] args) {
        /*
        1. Create Warehouse, Product, ProductCategory (enum), Currency (enum)
        2. Warehouse should have: name, List of Products, address, isActive
        3. Product should have: pricePerItem, name, quantity, product category, currency, isAvailable
        4. Create Warehouse object, Before create a list of products.
        5. In main method, switch case for various operations.
        6. For each operation, call service method and do the operation
         */

        WarehouseService warehouseService = new WarehouseServiceImpl();

        //Initializing the warehouse
        Warehouse warehouse = new Warehouse();
        warehouse.setName("ABC E-POOD");
        warehouse.setAddress("Tallinn");
        warehouse.setActive(true);

        warehouse.setProducts(Data.getInitialProducts());


        warehouseService.addWarehouse(warehouse);
    }
}
