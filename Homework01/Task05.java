package Homework01;

public class Task05 {
    public static void main(String[] args) {
        /*
        Задача 5:
            Да се изведат числата от 1 до 100 във възходящ и в
            низходящ ред и да се отпечатат получените резултати
            с помоща на for цикъл.
         */
        System.out.println("\n===========================");
        System.out.println("Numbers from 1 to 100:");
        System.out.println("===========================");
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }

        System.out.println("===========================");
        System.out.println("Numbers from 100 to 1:");
        System.out.println("===========================");
        for (int i = 100; i >= 1; i--) {
            System.out.println(i);
        }
    }
}