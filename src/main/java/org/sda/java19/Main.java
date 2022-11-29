package org.sda.java19;

import org.sda.java19.models.Group;
import org.sda.java19.models.Student;
import org.sda.java19.models.Trainer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * SDA Scheduler
 * Create a class hierarchy:
 * Person.java - firstname
 *             - lastname
 *             - dateOfBirth
 * Trainer.java (extends Person) - isAuthorized (boolean)
 * Student.java (extends Person) - hasPreviousJavaKnowledge (boolean)
 *
 * Create a Group class which has
 * name (Java19Remote, Java20Remote, etc)
 * one trainer
 * a list of students
 *
 * Manually initialize 15 students; 4 groups and 3 trainers;
 * Store all students in a list; all groups in a list; all trainers in a list;
 * Assign a trainer to each group
 * Assign 2-3 students to each group
 * Ensure the fact that a group will only have distinct students (How would you do that?)
 * Ensure the fact that a group will only have a maximum of 5 students;
 * When you try to add a 6th one throw an MaximumNumberOfStudentsReached exception
 * Display all students in a group sorted alphabetically by lastName
 * Display the group with the maximum number of students
 * Display all students younger than 25, from all groups
 * Display all students grouped by trainer that teaches to them
 * (eg. Trainer1 - stud1, stud3, stud4; Trainer2 - stud2, stud 10) -
 * regardless of the group they're part of (If you were to store this information in a data structure what would you use?)
 * Display all students with previous java knowledge
 * Display the group with the highest number of students with no previous java knowledge
 * Remove all the students younger than 20 from all groups. Display the groups before and after removal.
 *
 * @author Vinod John
 */
public class Main {
    public static void main(String[] args) {



       List<String> groupList = new ArrayList<>();
        Group group = new Group("JavaRemote19",);
        group.setName("JavaRemote19");


        Group group1 = new Group();
        group1.setName("JavaRemote20");
        group.setStudents(studentList().subList(4,7));
        group.setTrainer(trainerList().get(1));

        Group group2 = new Group();
        group2.setName("JavaRemote21");
        group.setStudents(studentList().subList(8,11));
        group.setTrainer(trainerList().get(2));

        System.out.println(group1);




    }

    private static List<Trainer> trainerList() {
        Trainer trainer = new Trainer();
        trainer.setFirstName("Vinod");
        trainer.setLastName("John");
        trainer.setAuthorized(true);

        Trainer trainer1 = new Trainer();
        trainer1.setFirstName("Mark");
        trainer1.setLastName("Stark");
        trainer1.setAuthorized(true);

        Trainer trainer2 = new Trainer();
        trainer2.setFirstName("Johnny");
        trainer2.setLastName("Perry");
        trainer2.setAuthorized(true);

        return List.of(trainer, trainer1, trainer2);

    }

    private static List<Student> studentList() {
        Student student = new Student();
        student.setFirstName("Mari");
        student.setLastName("Laas");
        student.setDateOfBirth(LocalDate.of(1999, 02, 11));
        student.setHasPreviousJavaKnowledge(true);

        Student student1 = new Student();
        student1.setFirstName("Mario");
        student1.setLastName("Tamm");
        student1.setDateOfBirth(06.01.1993);
        student1.setHasPreviousJavaKnowledge(true);

        Student student2 = new Student();
        student2.setFirstName("Tony");
        student2.setLastName("Stark");
        student2.setDateOfBirth(10.07.2000);
        student2.setHasPreviousJavaKnowledge(true);

        Student student3 = new Student();
        student3.setFirstName("Maris");
        student3.setLastName("Rose");
        student3.setDateOfBirth(08.02.1991);
        student3.setHasPreviousJavaKnowledge(true);

        Student student4 = new Student();
        student4.setFirstName("Peter");
        student4.setLastName("Brooks");
        student4.setDateOfBirth(09.02.1990);
        student4.setHasPreviousJavaKnowledge(true);

        Student student5 = new Student();
        student5.setFirstName("Anna");
        student5.setLastName("Marine");
        student5.setDateOfBirth(12.05.2001);
        student5.setHasPreviousJavaKnowledge(true);

        Student student6 = new Student();
        student6.setFirstName("Anthony");
        student6.setLastName("Stark");
        student6.setDateOfBirth(08.12.2003);
        student6.setHasPreviousJavaKnowledge(true);

        Student student7 = new Student();
        student7.setFirstName("Tommy");
        student7.setLastName("Stork");
        student7.setDateOfBirth(08.10.1992);
        student7.setHasPreviousJavaKnowledge(true);

        Student student8 = new Student();
        student8.setFirstName("Mark");
        student8.setLastName("Doom");
        student8.setDateOfBirth(06.11.2000);
        student8.setHasPreviousJavaKnowledge(true);

        Student student9 = new Student();
        student9.setFirstName("Liza");
        student9.setLastName("Carvalho");
        student9.setDateOfBirth(20.07.1994);
        student9.setHasPreviousJavaKnowledge(true);

        Student student10 = new Student();
        student10.setFirstName("Mario");
        student10.setLastName("Black");
        student10.setDateOfBirth(12.08.1991);
        student10.setHasPreviousJavaKnowledge(true);

        Student student11 = new Student();
        student11.setFirstName("Andero");
        student11.setLastName("Maar");
        student11.setDateOfBirth(08.10.1993);
        student11.setHasPreviousJavaKnowledge(true);

        Student student12 = new Student();
        student12.setFirstName("Ann");
        student12.setLastName("Bloum");
        student12.setDateOfBirth(10.10.1997);
        student12.setHasPreviousJavaKnowledge(true);

        Student student13 = new Student();
        student13.setFirstName("Hugo");
        student13.setLastName("Perg");
        student13.setDateOfBirth(12.02.1999);
        student13.setHasPreviousJavaKnowledge(true);

        Student student14 = new Student();
        student14.setFirstName("Tuuli");
        student14.setLastName("Kuum");
        student14.setDateOfBirth(08.02.2001);
        student14.setHasPreviousJavaKnowledge(true);


        Student student15 = new Student();
        student15.setFirstName("Marko");
        student15.setLastName("Loos");
        student15.setDateOfBirth(08.10.2000);
        student15.setHasPreviousJavaKnowledge(true);

        return List.of(student1, student2, student3, student3, student4, student5, student6, student7, student8, student9, student10, student11, student12, student13, student14, student15);
    }
}
