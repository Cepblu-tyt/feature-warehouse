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


import java.math.BigDecimal;
import java.util.*;

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
        warehouseService.updateWarehouse(warehouse);

        System.out.println(warehouse);
        productOperations();

    }


    private static void productOperations() throws WarehouseNotFoundException {
        ProductService productService = new ProductServiceImpl();

        int option = getOption();

        switch (option) {
            case 0: //Add a product
                productService.addProduct(addProduct());
                getOption();
                break;
            case 1: //Update a product
                productService.updateProduct(updateProduct());
                getOption();
                break;
            case 2:
                productService.deleteProductByName(deleteProduct());
                getOption();
                break;
            case 3:
                displayAllProducts(productService.getAllProducts());
                getOption();
                break;
            case 4:
                //display summary
                break;
            case 5:
                //sum of products and prices
                break;
            default:
                System.out.println("Incorrect option, choose the correct one!");
                productOperations();


        }
    }

    private static int getOption() {
        // User should be able to: add, display all of the details, update, delete an item

        System.out.println("     MENU :    ");


        List<String> menu = List.of("Add item", "Update items", "Delete item", "Display items");

        for (int i = 0; i < menu.size(); i++) {
            System.out.println(i + ". " + menu.get(i));
        }

        System.out.println("Choose a menu from above:");

        return SCANNER.nextInt();

    }

    private static void displayAllProducts(List<Product> products) {
        products.forEach(System.out::println);
    }

    private static String deleteProduct() {
        return null;
    }

    private static Product addProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the details of the product:");
        System.out.println("Product name:");
        String productName = scanner.next();
        System.out.println("Product price:");
        float price = scanner.nextFloat();
        System.out.println("Choose a product category: " + Arrays.toString(ProductCategory.values()));
        ProductCategory productCategory = ProductCategory.valueOf(scanner.next());
        System.out.println("Choose a currency: " + Arrays.toString(Currency.values()));
        Currency currency = Currency.valueOf(scanner.next());
        System.out.println("Is available: ");
        boolean isAvailable = scanner.hasNextBoolean();


        Product product = new Product();
        product.setName(productName);
        product.setPrice(BigDecimal.valueOf(price));
        product.setProductCategory(productCategory);
        product.setCurrency(currency);
        product.setAvailable(isAvailable);

        return product;
    }


    private static Product updateProduct() {

        //Need to display all the products and then ask user to which product to update.
        return null;

    }

    public static Product deleteProductByName() {

        return null;
    }
}
