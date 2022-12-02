package Homework01;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        /*
        Задача 3:
            Въведете 3 числа от клавиатурата ч1, ч2 и ч3. Разменете стойностите
            им така, че ч1 да има стойността на ч2, ч2 да има стойността на ч3,
            а ч3 да има старатастойност на ч1. Съберете ч1 и ч2 и след това намерете
            разликата между получения сбор и ч3. Разпечатете стойностите на числата
            на етапи.
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter first number: ");
        double number1 = sc.nextDouble();
        System.out.print("Please enter second number: ");
        double number2 = sc.nextDouble();
        System.out.print("Please enter third number: ");
        double number3 = sc.nextDouble();

        System.out.println("\n===========================");
        System.out.println("Original values of entered numbers:");
        System.out.println("===========================");
        System.out.println("number1 = " + number1);
        System.out.println("number2 = " + number2);
        System.out.println("number3 = " + number3);
        System.out.println("\n===========================");

        //swap values of numbers
        double temp = number1;
        number1 = number2;
        number2 = number3;
        number3 = temp;

        System.out.println("Numbers after swap:");
        System.out.println("===========================");
        System.out.println("number1 = " + number1);
        System.out.println("number2 = " + number2);
        System.out.println("number3 = " + number3);

        //sum of first 2 numbers
        double sum = number1 + number2;

        System.out.println("\n===========================");
        System.out.println("Sum of number1 and number2 is:");
        System.out.println("===========================");
        System.out.println("(" + number1 + ") + (" + number2 + ") = " + sum);

        //the sum of number1 and number2 minus number3
        double result = sum - number3;

        System.out.println("\n===========================");
        System.out.println("After extracting number3 \nfrom the sum of number1 and number2:");
        System.out.println("===========================");
        System.out.println("(" + sum + ") - (" + number3 + ") = " + result);
        sc.close();
    }
}