package Homework01;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        /*
        Задача 6:
            Да се въведе число от клавиатурата от 1 до 7 и да се
            изведе съобщение кой ден от седмицата отговаря на
            съответно число с подходящо съобщение.
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter number from 1 to 7 to check which day is today: ");
        int dayOfWeek = sc.nextInt();

        switch (dayOfWeek) {
            case 1:
                System.out.println("It's Monday.");
                break;
            case 2:
                System.out.println("It's Tuesday.");
                break;
            case 3:
                System.out.println("It's Wednesday.");
                break;
            case 4:
                System.out.println("It's Thursday.");
                break;
            case 5:
                System.out.println("It's Friday.");
                break;
            case 6:
                System.out.println("It's Saturday!");
                break;
            case 7:
                System.out.println("It's Sunday!");
                break;
            default:
                System.out.println("Invalid day of week!");
                break;
        }
            sc.close();
    }
}