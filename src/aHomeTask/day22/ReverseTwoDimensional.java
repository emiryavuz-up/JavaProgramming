package aHomeTask.day22;

import java.util.Arrays;

public class ReverseTwoDimensional {


    public static void main(String[] args) {

        int[][] arr2D = {{1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11, 12}};

        // Create a new array with the same structure as arr2D
        int[][] reversedArray = new int[arr2D.length][];

        for (int i = 0; i < arr2D.length; i++) {

            // Create a new row array with the same length as the corresponding row in arr2D
            reversedArray[i] = new int[arr2D[i].length];

            // Iterate through each element in the row in reverse order
            for (int j = 0; j < arr2D[i].length; j++) {
                reversedArray[i][j] = arr2D[i][arr2D[i].length - 1 - j];
            }
        }

        for (int i = 0; i < reversedArray.length; i++) {
            for (int j = 0; j < reversedArray[i].length; j++) {
                System.out.print(reversedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}





/*
1. Write a program that can reverse a two dimensional array (return new array)
		Ex:
			array = { {1,2,3}, {4,5,6}};


		output:
			reverse = { {6,5,4}, {3,2,1},};
 */