package ex3;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random(); // creating Random object
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(); // storing random integers in an array
        }

        System.out.println("The initial array is: ");

        for (int num : array) {
            System.out.print(num + " ");
        }
        Arrays.sort(array);

        System.out.println("\nThe sorted array is: ");

        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}