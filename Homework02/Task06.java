package Homework02;

import java.util.Arrays;

public class Task06 {
    public static void main(String[] args) {
        //Дадени са два масива със стойности {1, 2, 3} и {1, 2, 3}
        // да се състави програма, която проверява дали масивите са еднакви

        int[] givenArray1 = {1, 2, 3};
        int[] givenArray2 = {1, 2, 3};

        System.out.print("Given array 1 is:  ");
        printArray(givenArray1);
        System.out.print("Given array 2 is:  ");
        printArray(givenArray2);

        if (areArraysEqual(givenArray1, givenArray2)) {
            System.out.println("\nArrays are equal.");
        } else {
            System.out.println("\nArrays are not equal.");
        }
    }

    // method that prints the elements of a given array
    public static void printArray(int[] arr) {
        for (int index: arr) {
            System.out.print(index + "   ");
        }
        System.out.println();
    }

    // method that checks for equality ot two given integer arrays
    public static boolean areArraysEqual(int[] arr1, int[] arr2) {

        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
               return false;
            }
        }
        return true;
    }
}