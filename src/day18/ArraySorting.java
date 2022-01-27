package day18;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.logging.Logger;

public class ArraySorting {

    public static void main(String[] args) {
        Employee[] employees = new Employee[3];

        employees[0] = new Employee("ABC1", LocalDate.now(),500);
        employees[1] = new Employee("ABC0", LocalDate.now(),1500);
        employees[2] = new Employee("ABC2", LocalDate.now(),200);


        System.out.println("************* Before Sorting ***************");
        for (Employee employee: employees) {
            System.out.println(employee);
        }

        Arrays.sort(employees);

        System.out.println("************* After Sorting ***************");
        for (Employee employee: employees) {
            System.out.println(employee);
        }

    }
}
