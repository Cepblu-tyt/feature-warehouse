package org.sda.java19.vehicleExercise;

import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;
@Data
@ToString
public class Vehicle {

    private String brand;
    private String model;
    private BigDecimal price;
}
