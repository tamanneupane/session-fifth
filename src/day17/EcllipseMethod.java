package day17;

import java.util.logging.Logger;

public class EcllipseMethod {

    public static void main(String[] args) {
        add(2,3);
        add(2,3,5);
        add(2,3,5,10,20,40,20);

        System.out.printf("%d , %d , %d", 3,2,5);
    }

//    public static void add(int a, int b){
//        int temp = a + b;
//        Logger.getGlobal().info(String.valueOf(temp));
//    }
//
//    public static void add(int a, int b, int c){
//        int temp = a + b + c;
//        Logger.getGlobal().info(String.valueOf(temp));
//    }

    public static void add(int... values){
        int temp = 0;
        for (int value : values) {
            temp += value;
        }
        Logger.getGlobal().info(String.valueOf(temp));
    }


}
