package org.sda.java19.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Data

public class Person {
   private String firstName;
   private String lastName;
   private LocalDate dateOfBirth;
}
