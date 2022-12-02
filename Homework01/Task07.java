package Homework01;

public class Task07 {
    public static void main(String[] args) {
        /*
        Задача 7:
            Да се изведат числата от 1 до 100 без числата от 54 до 74.
            След извършените операции да се отпечатат получените резултати.
            (hint - continue)
         */

        for (int i = 1; i <= 100; i++) {
            if ((i >= 54) && (i <= 74)) {
                continue;
            }
            System.out.println(i);
        }
    }
}