package day11;

import day4.Account;

import java.util.Arrays;
import java.util.logging.Logger;

public class ArrayPractice {

    public static void main(String[] args) {
//        int[] ints = {1,2,3,4};
//        String[] names = {"Taman","Ram", "Shyam"};
//        Account[] accounts = {new Account(), new Account(), new Account()};
//
//        int[] a = new int[5];
//        int[] updatedArray = new int[4];
//        Account[] rbbAccounts = new Account[3];
//
//        a[0] = 5;
//        a[3]= 4;
//        a[4]= 1;
//
//        for (int i = 0; i < a.length; i++ ){
//            if(i == 4){
//                updatedArray[3] = a[i];
//            } else if(i != 3){
//                updatedArray[i] = a[i];
//            }
//        }

//        int j = 0;
//        for (int i : updatedArray) {
//            System.out.println(i);
//            j++;
//        }

//        int zeroPosition = a[0];
//        Logger.getGlobal().info(String.valueOf(zeroPosition));

//        rbbAccounts[0] =  new Account();
//        Account zeroPosition = rbbAccounts[1];
//        Logger.getGlobal().info(String.valueOf(zeroPosition));

        int[] primeNumbers = {2,3,5,7,11,13};

        int[] copyOfPrimeNumbers = Arrays.copyOf(primeNumbers, primeNumbers.length);

        copyOfPrimeNumbers[0] = 0;

        Logger.getGlobal().info(String.valueOf(primeNumbers[0]));


    }
}
