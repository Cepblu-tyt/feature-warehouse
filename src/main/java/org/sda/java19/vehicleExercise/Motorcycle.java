package org.sda.java19.vehicleExercise;


import lombok.Data;
import lombok.ToString;


@Data
@ToString(callSuper = true)
public class Motorcycle extends Vehicle{
      private float TopSpeed;
      private VehicleShape vehicleShape;
}
