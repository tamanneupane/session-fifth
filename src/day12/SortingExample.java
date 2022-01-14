package day12;

import java.util.Arrays;

public class SortingExample {

    public static void main(String[] args) {
        int [] integers = {3,1,8,5,6};

        System.out.println("************* Before Sorting ***************");

        for (int integer : integers) {
            System.out.println(integer);
        }

        //Sorting
        Arrays.sort(integers);

        System.out.println("************* After Sorting ***************");

        for (int integer : integers) {
            System.out.println(integer);
        }

    }
}
