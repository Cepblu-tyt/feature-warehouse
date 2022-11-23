package org.sda.java19.vehicleExercise;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Tractor {
    private String brand;
    private String model;
    private double price;
    private int maxPulledWeight;
}
