package day16;

import day15.Student;

import java.util.ArrayList;
import java.util.logging.Logger;

public class ArrayListPractice {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(15);
        names.add("1ABC");
        names.add("2ABC");
        names.add("3ABC");
        names.add("4ABC");
        names.add("5ABC");

        Logger.getGlobal().info(names.toString());

        names.add(2, "6ABC");

        Logger.getGlobal().info(names.toString());

        names.set(2, "7ABC");

        Logger.getGlobal().info(names.toString());

        ArrayList<String> namesCopy = new ArrayList<>();
        namesCopy.addAll(names);

        Logger.getGlobal().info(namesCopy.toString());

        String secondIndexData = names.get(2);
        Logger.getGlobal().info(secondIndexData);

        boolean isRemoved = names.remove("7abc");

        Logger.getGlobal().info(String.valueOf(isRemoved));

        Logger.getGlobal().info(names.toString());

        String removedElement = names.remove(2);

        Logger.getGlobal().info(removedElement);

        Logger.getGlobal().info(names.toString());

        namesCopy.removeAll(names);

        Logger.getGlobal().info(namesCopy.toString());

//        ArrayList<Student> students = new ArrayList<>(5);
//        students.add(new Student("1ABC", 1,1));
//        students.add(new Student("2ABC", 2, 1));
//
//        Logger.getGlobal().info(students.toString());
//
//        students.remove(new Student("1abc", 1,1));
//
//        Logger.getGlobal().info(students.toString());


    }

}
