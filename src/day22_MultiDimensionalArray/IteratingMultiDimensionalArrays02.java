package day22_MultiDimensionalArray;

public class IteratingMultiDimensionalArrays02 {

    public static void main(String[] args) {

        int[][] arr2D = { {1, 2, 3} , {4, 5, 6, 7, 8} , {9, 10, 11, 12, 13} };

        for (int i = arr2D.length - 1; i >= 0; i--) { // i: index number of one dimensional array starting from last index to zero

            for(int j = 0; j < arr2D[i].length; j++){ // j: index numbers of elements starting from 0 to last index
                System.out.print(arr2D[i][j] + " ");
            }

            System.out.println();
        }


        System.out.println("-------------------------------------------------");

        for (int i = 0; i < arr2D.length; i++) { // i: indexes of each 1D array started from 0

            for (int j = arr2D[i].length - 1; j >= 0; j--) {    // j: indexes of each element starting from last index
                System.out.print( arr2D[i][j] + " " );         //  go from each 1D array and go to 0

            }
            System.out.println();
        }


    }

}
/*
task:
9 10 11 12 13
4 5 6 7 8
1 2 3

task2:
print in reversed order
1 2 3
4 5 6 7 8
9 10 11 12 13
 */
