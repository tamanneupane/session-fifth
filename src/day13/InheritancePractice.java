package day13;

import java.time.LocalDate;
import java.util.logging.Logger;

public class InheritancePractice {

    public static void main(String[] args) {
        Employee employee = new Employee("ABC", LocalDate.now(), 5000);

        Logger.getGlobal().info(String.valueOf(employee));

//        Logger.getGlobal().info(String.valueOf(employee.getSalary()));

        Manager manager = new Manager("MAN", LocalDate.now(), 10000, 1000);

        Logger.getGlobal().info(String.valueOf(manager));

//        Logger.getGlobal().info(String.valueOf(manager.getSalary()));

        Executive executive = new Executive("MAN", LocalDate.now(), 10000, 1000);
        executive.getName();

    }
}
