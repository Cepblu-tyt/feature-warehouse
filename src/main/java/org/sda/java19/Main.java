package org.sda.java19;

import org.sda.java19.exceptions.WarehouseNotFoundException;
import org.sda.java19.models.Currency;
import org.sda.java19.models.Product;
import org.sda.java19.models.ProductCategory;
import org.sda.java19.models.Warehouse;
import org.sda.java19.services.ProductService;
import org.sda.java19.services.WarehouseService;
import org.sda.java19.services.implementation.ProductServiceImpl;
import org.sda.java19.services.implementation.WarehouseServiceImpl;
import org.sda.java19.util.Data;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * 2. Warehouse
 * a. User should be able to: add, display all of the details, update, delete an item
 * b. Use composition and collections (The warehouse has products/items)
 * c. Add possibility to display summaries, like sum of all of the products, their prices.
 * d. *Add possibility to update number of items in a specific way, e.g.:
 * “pliers:30”
 * “scissors:+4”
 *
 * @author Sergei Oksanen
 */
public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) throws WarehouseNotFoundException {
        /*
        1. Create Warehouse, Product, ProductCategory (enum), Currency (enum) - models package
        2. Warehouse : name, List of Product, address, isActive
        3. Product: name, pricePerItem, quantity, product category, currency, isAvailable
        4. Create Warehouse object, Before create list of products.
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

        warehouseService.addWarehouse(warehouse); // Adds new warehouse

        productOperations();

    }


    private static void productOperations() throws WarehouseNotFoundException {
        ProductService productService = new ProductServiceImpl();

        int option = getOption();

        switch (option) {
            case 1: //Add a product
                productService.addProduct(addProduct());
                productOperations();
                break;
            case 2: //Update a product
                productService.updateProduct(updateProduct());
                productOperations();
                break;

            default:
                System.out.println("Incorrect option, choose the correct one!");
                //Update a product
        }
    }

 private static int getOption() {
        // User should be able to: add, display all of the details, update, delete an item
     System.out.println("--------------");
     System.out.println("     MENU    ");
     System.out.println("--------------");

     List<String> menu = List.of("Add item", "Delete item", "Display items", "Exit");

     for (int i = 0; i < menu.size(); i++) {
         System.out.println(i + 1 + ". " + menu.get(i));
     }

     System.out.println("Choose a menu from above:");

     return SCANNER.nextInt();

    }

    private static Product addProduct() {

        System.out.println("Enter the details of the product:");
        System.out.println("Product name:");
        String productName = SCANNER.next();
        System.out.println("Product price:");
        float price = SCANNER.nextFloat();
        System.out.println("Choose a product currency: " + Arrays.toString(Currency.values()));
        Currency currency = Currency.valueOf(SCANNER.next());
        System.out.println("Choose a product category: " + Arrays.toString(ProductCategory.values()));
        ProductCategory productCategory = ProductCategory.valueOf(SCANNER.next());



        Product product = new Product();
        product.setName(productName);
        product.setPricePerItem(Float.valueOf(price));
        product.setCurrency(currency);
        product.setProductCategory(productCategory);

        System.out.println(product);

        return product;


    }

  private static Product updateProduct() {

        //Need to display all the products and then ask user to which product to update.
        return null;

    }


}