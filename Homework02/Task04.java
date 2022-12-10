package Homework02;

public class Task04 {
    public static void main(String[] args) {
        /*
            Напишете програма, която създава масив с 10 елемента от тип int и обходете масива:
                1) с помоща на for loop
                2) с помоща на while loop
                Да се изведат елементите на екрана.
         */

        int[] myArray = {-3, 0, 9, 9999, -3333, 2, -1, 9, 12, 0};

        //print the elements of an int[] with for loop
        System.out.println("Array elements printed with for loop: ");
        printArrayWithForLoop(myArray);

        //print the elements of an int[]] with for loop
        System.out.println("\nArray elements printed with while loop: ");
        printArrayWithWhileLoop(myArray);
    }

    // method that prints the elements of a given array with for loop
    public static void printArrayWithForLoop(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "   ");
        }
        System.out.println();
    }

    // method that prints the elements of a given array with while loop
    public static void printArrayWithWhileLoop(int[] arr) {
        int elementsCount = 0;

        while (elementsCount < arr.length) {
            System.out.print(arr[elementsCount] + "   ");
            elementsCount++;
        }
        System.out.println();
    }
}