package day7;

import java.time.LocalDate;
import java.util.Objects;
import java.util.logging.Logger;

public class Employee {

    public static int count;
    private String name = ""; // Required
    private double salary = 0; // Required
    private LocalDate joiningDate = LocalDate.now(); // Required
    private int age = 0; // optional


    public Employee(String name, double salary, LocalDate joiningDate){
        this.name = Objects.requireNonNullElse(name,"Unknown");
        this.salary = salary;
        this.joiningDate = Objects.requireNonNullElse(joiningDate, LocalDate.now());
    }

    public Employee(String name, double salary, LocalDate joiningDate, int age){
        this(name, salary, joiningDate);
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getJoiningDate() {
        return joiningDate;
    }

    public int getAge() {
        return age;
    }
}
