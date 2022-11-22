package org.sda.java19.services;

import org.sda.java19.models.Product;
import org.sda.java19.models.Warehouse;

public interface WarehouseService {

    void addWarehouse(Warehouse warehouse);
    void updateWarehouse(Warehouse warehouse);
    void deleteWarehouse();
    Warehouse getWarehouse();

}



