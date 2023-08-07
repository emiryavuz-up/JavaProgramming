package aHomeTask.day25;

import java.util.Arrays;

public class Reverse {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6};

        int[] reversed = reverse(array);

        System.out.println(Arrays.toString(reversed));


    }

    public static int[] reverse(int[] array) {

        int[] reversed = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length-1-i];
        }
        return reversed;
    }


}
/*
Create a method that can reverse an integer array

	2. Create a method that can reverse a double array

	3. Create a method that can reverse a char array

	4. Create a method that can reverse a String array
 */