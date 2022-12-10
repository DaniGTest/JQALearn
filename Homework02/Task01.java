package Homework02;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        //Да се състави метод, който приема като аргументи две числа и отпечатва на екрана техния сбор.

        //it is not mentioned if the numbers are integer or not, so I am using double
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter first number: ");
        double firstNumber = sc.nextDouble();
        System.out.print("Please enter second number: ");
        double secondNumber = sc.nextDouble();

        printSum(firstNumber, secondNumber);
        sc.close();
    }

    // method that prints the sum of two numbers
    public static void printSum(double number1, double number2) {
        double sum = number1 + number2;
        System.out.printf("%nThe sum is:%n (%.2f) + (%.2f) = %.2f %n", number1, number2, sum);
    }
}