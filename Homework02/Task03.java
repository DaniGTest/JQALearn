package Homework02;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        //Да се прочете масив от екрана с 5 числа по избор от тип double и да се отпечатат всички резултати.

        double[] userArray = new double[5];

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 5 double numbers for your array: ");

        for (int i = 0; i < 5; i++) {
            userArray[i] = sc.nextDouble();
        }

        System.out.println("The entered array is:");
        printArray(userArray);
        sc.close();
    }

    // method that prints the elements of a given array
    public static void printArray(double[] arr) {

        for (double index: arr) {
            System.out.print(index + "   ");
        }
    }
}