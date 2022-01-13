package day7;

import java.time.LocalDate;
import java.util.logging.Logger;

public class Office {

    public static void main(String[] args) {
        double i = 10.0;

        Employee employee1 = new Employee(null,500, null);

        Employee employee2 = new Employee("Tamannna Neupane",1000, LocalDate.now(), 30);

        employee1.count = 100;

        Logger.getGlobal().info(String.valueOf(employee2.count));

//        Logger.getGlobal().info(employee1.getName().toLowerCase());
//        Logger.getGlobal().info(employee2.getName());

    }
}
