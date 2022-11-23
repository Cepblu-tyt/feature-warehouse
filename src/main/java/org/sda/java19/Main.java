package org.sda.java19;

import org.sda.java19.vehicleExercise.*;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        Path vehiclePath = Paths.get("\\Users\\Home\\java-advance\\java-advanced-coding\\src\\main\\java\\resources\\vehicle.txt");


            // File reading
            List<String> fileLines = Files.readAllLines(vehiclePath, StandardCharsets.UTF_8);
            List<Car> carList = new ArrayList<>();
            List<Motorcycle> motorcycleList = new ArrayList<>();
            List<Tractor> tractorList = new ArrayList<>();
            List<Bicycle> bicycleList = new ArrayList<>();


        for(String fileLine: fileLines ) {
                String[] vehicle = fileLine.split(", ");

                switch(vehicle[0]) {
                    case "Car":
                        Car car = new Car();
                        car.setBrand(vehicle[1]);
                        car.setModel(vehicle[2]);
                        car.setPrice(BigDecimal.valueOf(Long.parseLong(vehicle[3])));
                        car.setTopSpeed(Float.parseFloat(vehicle[4]));
                        car.setVehicleTransmission(VehicleTransmission.valueOf(vehicle[5]));
                        car.setVehicleShape(VehicleShape.valueOf(vehicle[6]));

                        carList.add(car);
                        break;

                    case "Motorcycle":
                        Motorcycle motorcycle = new Motorcycle();
                        motorcycle.setBrand(vehicle[1]);
                        motorcycle.setModel(vehicle[2]);
                        motorcycle.setPrice(BigDecimal.valueOf(Long.parseLong(vehicle[3])));
                        motorcycle.setTopSpeed(Float.parseFloat(vehicle[4]));
                        motorcycle.setVehicleShape(VehicleShape.valueOf(vehicle[5]));

                        motorcycleList.add(motorcycle);
                        break;

                    case "Tractor":
                        Tractor tractor = new Tractor();
                        tractor.setBrand(vehicle[1]);
                        tractor.setModel(vehicle[2]);
                        tractor.setPrice(BigDecimal.valueOf(Long.parseLong(vehicle[3])));
                        tractor.setMaxPulledWeight(Float.parseFloat(vehicle[4]));

                        tractorList.add(tractor);
                        break;

                    case "Bicycle":
                        Bicycle bicycle = new Bicycle();
                        bicycle.setBrand(vehicle[1]);
                        bicycle.setModel(vehicle[2]);
                        bicycle.setPrice(BigDecimal.valueOf(Long.parseLong(vehicle[3])));

                        bicycleList.add(bicycle);
                        break;

                    default:
                        System.out.println("Invalid vehicle!");


                }
            }

        System.out.println("Number of cars: " + carList.size());
        System.out.println("Number of motorcycles: " + motorcycleList.size());
        System.out.println("Number of tractors: " + tractorList.size());

    }
    private static Float convertStringToLFloat(String numberStr){
        try {
            return Float.parseFloat(numberStr);
        } catch (Exception e) {
            return 0F;
        }
    }

    private static Long convertStringToLong(String numberStr){
        try {
            return  Long.parseLong(numberStr);
        } catch (Exception e) {
            return 0L;
        }
    }
}