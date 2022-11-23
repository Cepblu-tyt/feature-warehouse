package org.sda.java19.vehicleExercise;


import lombok.Data;
import java.math.BigDecimal;


@Data
public class Car extends  Vehicle{

    private float topSpeed;
    private VehicleTransmission vehicleTransmission;
    private VehicleShape vehicleShape;
}
