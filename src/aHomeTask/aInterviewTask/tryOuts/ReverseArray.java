package aHomeTask.aInterviewTask.tryOuts;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        /*
        String[] original = {"Hello", "World", "This", "Is", "Java"};
        String[] reversed = new String[original.length];

        for (int i = original.length - 1, j = 0; i >= 0; i--, j++) {
            reversed[j] = original[i];
        }

        System.out.println(Arrays.toString(reversed));
         */
        

        int[] numbers = {1, 2, 3, 4, 5};
        int[] reversed = new int[numbers.length];


        for (int i = numbers.length - 1, j = 0; i >= 0; i--, j++) {
            reversed[j] = numbers[i];
        }

        System.out.println(Arrays.toString(reversed));

    }
}
