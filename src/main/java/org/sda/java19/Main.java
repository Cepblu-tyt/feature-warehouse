package org.sda.java19;

import org.sda.java19.vehicleExercise.*;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        Path vehiclePath = Paths.get("\\Users\\Home\\java-advance\\java-advanced-coding\\src\\main\\java\\resources\\vehicle.txt");


        //File Reading
        List<String> fileLines = Files.readAllLines(vehiclePath, StandardCharsets.UTF_8);
        List<Car> carList = new ArrayList<>();
        List<Motorcycle> motorcycleList = new ArrayList<>();
        List<Tractor> tractorList = new ArrayList<>();
        List<Bicycle> bicycleList = new ArrayList<>();

        // Just to print the file which was read above
        for (String fileLine : fileLines) {
            String[] vehicle = fileLine.split(", ");

            switch (vehicle[0]) { // Gets the first word
                case "Car":
                    Car car = new Car();
                    car.setBrand(vehicle[1]);
                    car.setModel(vehicle[2]);
                    car.setPrice(BigDecimal.valueOf(convertStringToLong(vehicle[3])));
                    car.setTopSpeed(convertStringToFloat(vehicle[4]));
                    car.setVehicleTransmission(VehicleTransmission.valueOf(vehicle[5]));
                    car.setVehicleShape(VehicleShape.valueOf(vehicle[6]));

                    carList.add(car);
                    break;
                case "Motorcycle":
                    Motorcycle motorcycle = new Motorcycle();
                    motorcycle.setBrand(vehicle[1]);
                    motorcycle.setModel(vehicle[2]);
                    motorcycle.setPrice(BigDecimal.valueOf(convertStringToLong(vehicle[3])));
                    motorcycle.setTopSpeed(convertStringToFloat(vehicle[4]));
                    motorcycle.setVehicleShape(VehicleShape.valueOf(vehicle[5]));

                    motorcycleList.add(motorcycle);
                    break;
                case "Tractor":
                    Tractor tractor = new Tractor();
                    tractor.setBrand(vehicle[1]);
                    tractor.setModel(vehicle[2]);
                    tractor.setPrice(BigDecimal.valueOf(convertStringToLong(vehicle[3])));
                    tractor.setMaxPulledWeight(convertStringToFloat(vehicle[4]));

                    tractorList.add(tractor);
                    break;
                case "Bicycle":
                    Bicycle bicycle = new Bicycle();
                    bicycle.setBrand(vehicle[1]);
                    bicycle.setModel(vehicle[2]);
                    bicycle.setPrice(BigDecimal.valueOf(convertStringToLong(vehicle[3])));

                    bicycleList.add(bicycle);
                    break;
                default:
                    System.out.println("Invalid vehicle!");
            }
        }

        //#2
        System.out.println("Number of cars: " + carList.size());
        System.out.println("Number of motorcycles: " + motorcycleList.size());
        System.out.println("Number of tractors: " + tractorList.size());

        //#3
        //Brand count for cars
        Map<String,Long> brandMap = carList.stream()
                .collect(Collectors.groupingBy(Car::getBrand, Collectors.counting()));
        System.out.println(brandMap);


        //#4
        //Sort by price
        carList.stream()
                .sorted(Comparator.comparing(Vehicle::getPrice))
                .collect(Collectors.toList())
                .forEach(car -> System.out.println(car.toString()));

        //#5
        motorcycleList.stream()
                .filter(motorcycle -> VehicleShape.CHOPPER.equals(motorcycle.getVehicleShape()))
                .sorted(Comparator.comparing((Motorcycle::getTopSpeed)))
                .collect(Collectors.toList())
                .forEach(motorcycle -> System.out.println(motorcycle.toString()));

        //#6
        Path carPath = Paths.get("\\Users\\Home\\java-advance\\java-advanced-coding\\src\\main\\java\\resources\\cars.txt");
        Files.write(carPath, convertObjectListToStringList(Collections.singletonList(carList)), StandardOpenOption.WRITE);

    }

    private static Float convertStringToFloat(String numberStr) {
        try {
            return Float.parseFloat(numberStr);
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
            return 0f;
        }
    }

    private static Long convertStringToLong(String numberStr) {
        try {
            return Long.parseLong(numberStr);
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
            return 0L;
        }
    }

    private static List<String> convertObjectListToStringList(List<Object> objectList) {
        return objectList.stream()
                .map(Object::toString)
                .collect(Collectors.toList());
    }
}