package org.sda.java19;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Path absolutePath = Paths.get("\\Users\\Home\\java-advance\\java-advanced-coding\\src\\main\\java\\resources\\vehicle.txt");
        Path relativePath = Paths.get("vehicle.txt");
        try {
            // File reading
            List<String> vehicleList = Files.readAllLines(absolutePath, StandardCharsets.UTF_8);

            List<String> carList = vehicleList.stream()
                    .filter(s -> s.startsWith("Car"))   // Filter returns Stream<T>
                    .collect(Collectors.toList()); // Convert Stream<T> to List<T>
            System.out.println(carList.toString());

            List<String> motorcycleList = vehicleList.stream()
                    .filter(s -> s.startsWith("Motorcycle"))   // Filter returns Stream<T>
                    .collect(Collectors.toList()); // Convert Stream<T> to List<T>
            System.out.println(motorcycleList.toString());


            List<String> tractorList = vehicleList.stream()
                    .filter(s -> s.startsWith("Tractor"))   // Filter returns Stream<T>
                    .collect(Collectors.toList()); // Convert Stream<T> to List<T>
            System.out.println(tractorList.toString());

            List<String> bicycleList = vehicleList.stream()
                    .filter(s -> s.startsWith("Bicycle"))   // Filter returns Stream<T>
                    .collect(Collectors.toList()); // Convert Stream<T> to List<T>
            System.out.println(bicycleList.toString());


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}