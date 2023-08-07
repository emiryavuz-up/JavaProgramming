package aHomeTask.day25;

import java.util.Arrays;

public class MaxNumber {

    public static void main(String[] args) {


        int[] array = {1,2,3,4,5};

        maxNumber(array);

        int findMax = maxNumber(array);

        System.out.println(findMax);
    }

    public static int maxNumber(int[] array){

        Arrays.sort(array);

        int max = 0;
        for (int each : array) {
           max = array[array.length-1];

        }
        return max;
    }


    public static double maxNumber2(double[] array) {
        double max = array[0];
        for (double num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

/*
int[] numbers = {100, 500, 30, 40, 80, 90};
        int min = numbers[0]; // assuming first is the min number to compare with others with loops
                            // when there is a smaller number, we will assign it to this int min

        for (int i = 0; i < numbers.length; i++) {
         if(numbers[i] < min){ // check if there is an element in the array that's smaller
             min = numbers[i]; // assign that number to the min
         }
        }
 */
}
/*
Task 2:
	1. create a method that can return the max number from an integer array

	2. create a method that can return the max number from double array

	3. create a method that can return the max number from long array

	4. create a method that can return the max number from short array

	5. create a method that can return the max number from float array

	6. create a method that can return the max number from byte array
 */