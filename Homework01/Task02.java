package Homework01;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
        Задача 2:
            Въведете 4 различни числа от конзолата и разменте стойността
            им две по две. Нека числата бъдат от различен тип (int и double).
            Разпечатайте новите им стойности. Направете кастване (casting)
            конвертиране на числата веднъж от int to double и после от double
            to int и след всяко конвертиране изведете сумата им.
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter first Integer number: ");
        int firstInt = sc.nextInt();
        System.out.print("Please enter second Integer number: ");
        int secondInt = sc.nextInt();
        System.out.print("Please enter first double number: ");
        double firstDouble = sc.nextDouble();
        System.out.print("Please enter second double number: ");
        double secondDouble = sc.nextDouble();

        System.out.println("\n===========================");
        System.out.println("Original entered numbers:");
        System.out.println("===========================");
        System.out.println("First integer: " + firstInt);
        System.out.println("Second integer: " + secondInt);
        System.out.println("First double: " + firstDouble);
        System.out.println("Second double: " + secondDouble);
        System.out.println("\n===========================");

        //swap int numbers
        int tempInt = firstInt;
        firstInt = secondInt;
        secondInt = tempInt;

        //swap double numbers
        double tempDouble = firstDouble;
        firstDouble = secondDouble;
        secondDouble = tempDouble;

        System.out.println("Numbers after swap:");
        System.out.println("===========================");
        System.out.println("First integer: " + firstInt);
        System.out.println("Second integer: " + secondInt);
        System.out.println("First double: " + firstDouble);
        System.out.println("Second double: " + secondDouble);

        //int to double casting
        double castedInt1 = firstInt;
        double castedInt2 = secondInt;
        double doubleSum = castedInt1 + castedInt2;

        System.out.println("\n===========================");
        System.out.println("Sum of INTs casted to double:");
        System.out.println("===========================");
        System.out.println("(" + castedInt1 + ") + (" + castedInt2 + ") = " + doubleSum);

        //double to int casting
        int castedDouble1 = (int)firstDouble;
        int castedDouble2 = (int)secondDouble;
        int intSum = castedDouble1 + castedDouble2;

        System.out.println("\n===========================");
        System.out.println("Sum of Doubles casted to int:");
        System.out.println("===========================");
        System.out.println("(" + castedDouble1 + ") + (" + castedDouble2 + ") = " + intSum);

        sc.close();
    }
}