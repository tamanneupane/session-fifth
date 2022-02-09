package day26;

import java.util.*;
import java.util.logging.Logger;

public class IteratorPractice {

    public static void main(String[] args) {
//        Collection<String> stringArrayList = new ArrayList<>();
//        stringArrayList.add("A");
//        stringArrayList.add("C");
//        stringArrayList.add("D");
//        stringArrayList.add("D");
//        stringArrayList.add("B");
//
//        Logger.getGlobal().info(stringArrayList.toString());
//
//        Collection<String> noDuplicateStringList = new TreeSet<>(stringArrayList);
//        Logger.getGlobal().info(noDuplicateStringList.toString());

//        Iterator<String> iterator = stringArrayList.iterator();
//        while (iterator.hasNext()){
//            String item = iterator.next();
//            Logger.getGlobal().info(item);
//        }


//        for (String item :stringArrayList) {
//            Logger.getGlobal().info(item);
//        }

//        boolean contains = stringArrayList.contains("A");
//        Logger.getGlobal().info(String.valueOf(contains));
//
//
        Collection<Student> students = new TreeSet<Student>(Comparator.comparing(Student::getRollNumber));
        students.add(new Student("B", 2));
        students.add(new Student("A", 1));
        students.add(new Student("C", 1));
        students.add(new Student("D", 1));
        students.add(new Student("E", 1));

        students.add(new Student("A", 1));

        Logger.getGlobal().info(students.toString());

//        students.add(new Student("C", 3));
//        students.add(new Student("D", 4));
//
//        boolean sContains = students.contains(new Student("A", 1));
//        Logger.getGlobal().info(String.valueOf(sContains));
//
//        students.clear();
//        boolean isStudentListEmpty = students.isEmpty();
//        Logger.getGlobal().info(String.valueOf(isStudentListEmpty));
    }
}
