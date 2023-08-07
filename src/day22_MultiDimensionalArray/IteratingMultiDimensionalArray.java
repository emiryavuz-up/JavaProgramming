package day22_MultiDimensionalArray;

import java.util.Arrays;

public class IteratingMultiDimensionalArray {

    public static void main(String[] args) {


        int[][] arr2D = { {1, 2, 3} , {4, 5, 6, 7} , {8, 9, 10, 11, 12} };

        // print elements one by one in separate lines

        // 1st bracket indexes 1D arrays
        // 2nd bracket Indexes of Elements

        for (int i = 0; i < arr2D.length; i++) { // i: index numbers of single dimensional array

            // System.out.println(Arrays.toString(arr2D[i])); // print each of the single dimensional arrays

            for (int j = 0; j < arr2D[i].length; j++) { // j: index numbers of elements
                                                        // start from 0 and go by one to each single dimensional array

                System.out.print( arr2D[i][j] + " ");

            }

            System.out.println(); // to print elements of arrays line by line
        }


    }

}
