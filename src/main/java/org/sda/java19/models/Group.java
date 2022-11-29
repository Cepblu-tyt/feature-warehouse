package org.sda.java19.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data


public class Group {
    private String name;
    private Trainer trainer;
    private List<Student> students;


}