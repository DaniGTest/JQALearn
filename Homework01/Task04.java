package Homework01;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        /*
        Задача 4:
            Въведете 3 променливи от клавиатурата – брой работни часове (целочислен тип), сума пари (число
            с плаваща запетая), дали е почивен ден – булев тип. Съставете програма, която взема решения на базата на тези данни по следния начин:
            - ако не е почивен ден ще работя
            - ако имам пари и е почивен ден ще отида на кино
            - ако нямам – ще стоя вкъщи и ще гледам телевизия
            - ако е почивен ден
            - ако имам по-малко от 10 лв ще отида за сладолед
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter count of working hours: ");
        int workingHours = sc.nextInt();
        System.out.print("Please enter your money balance: ");
        double moneyBalance = sc.nextDouble();
        System.out.print("Please choose if it is holiday (true/false): ");
        boolean isItHoliday = sc.nextBoolean();

        if (isItHoliday) {
            if (moneyBalance >= 10) {
                System.out.println("It is Holiday and I have money, so I will go to cinema!");
            } else if (moneyBalance == 0) {
                System.out.println("It is Holiday but I don't have money, so I will stay at home watching TV!");
            } else { // moneyBalance is < 10
                System.out.println("It is Holiday but I have less than 10 levs, so I will go for icecream!");
            }
        } else {
            System.out.println("It is not Holiday, so I'll go to work!");
        }
    }
}