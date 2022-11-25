package org.sda.java19.vehicleExercise;


import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;


@Data
@ToString(callSuper = true)
public class Car extends  Motorcycle{

    private VehicleTransmission vehicleTransmission;

}
