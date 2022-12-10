package Homework02;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        //Да се състави метод, който приема като аргументи две числа и връща тяхното средноаритметично.

        //it is not mentioned if the numbers are integer or not, so I am using double
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter first number: ");
        double firstNumber = sc.nextDouble();
        System.out.print("Please enter second number: ");
        double secondNumber = sc.nextDouble();

        double averageOfTwoNumbers = calculateAverageOfNumbers(firstNumber, secondNumber);
        System.out.printf("%nCalculated average of the two numbers is: %n((%.2f) + (%.2f)) / 2 = %.2f %n",
                            firstNumber, secondNumber, averageOfTwoNumbers);

        sc.close();
    }

    // method that calculates the average of two numbers
    public static double calculateAverageOfNumbers(double number1, double number2) {
        double average = (number1 + number2) / 2;
        return average;
    }
}