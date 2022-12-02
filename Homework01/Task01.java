package Homework01;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /*
        Задача 1:
           Да се изпишат подканващи съобщения към user, с които да въведе
           две числа от клавиатурата (тип int или double). След всяко въвеждане
           числата да бъдат отпечатени с подходящ текст. Да се въведе и 3-то
           число като се провери дали то е между първото и второто, като се
           изведе подходящо съобщение.
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter one number: ");
        double firstNumber = sc.nextDouble();
        System.out.println("You entered: " + firstNumber);
        System.out.print("Please enter second number: ");
        double secondNumber = sc.nextDouble();
        System.out.println("You entered: " + secondNumber);
        System.out.print("Please enter third number: ");
        double thirdNumber = sc.nextDouble();
        System.out.println("You entered: " + thirdNumber);

        //check if third number is between the other two but NOT inclusive
        if ((firstNumber < thirdNumber) && (thirdNumber < secondNumber) ||
                (secondNumber < thirdNumber) && (thirdNumber < firstNumber)) {
            System.out.println(thirdNumber + " is between " + firstNumber + " and " + secondNumber);
        } else {
            System.out.println(thirdNumber + " is NOT between " + firstNumber + " and " + secondNumber);
        }
        sc.close();
    }
}