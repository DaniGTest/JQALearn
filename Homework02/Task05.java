package Homework02;

public class Task05 {
    public static void main(String[] args) {
        //Да се състави масив със следните стойности {10 12 1 8 4}.
        // След създаването на масива да се копират стойностите в нов масив

        int[] givenArray = {10, 12, 1, 8, 4};

        int[] copyArray = copyIntArray(givenArray);

        System.out.println("Given array is:");
        printArray(givenArray);
        System.out.println("\nCopied array is:");
        printArray(copyArray);
    }

    // method that prints given array
    public static void printArray(int[] arr) {
        for (int index: arr) {
            System.out.print(index + "   ");
        }
        System.out.println();
    }

    public static int[] copyIntArray(int[] arr) {
        int[] newCopyOfArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newCopyOfArr[i] = arr[i];
        }
        return newCopyOfArr;
    }
}