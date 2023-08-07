package day22_MultiDimensionalArray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MultiDimensionalArraysIntro {

    public static void main(String[] args) {

        String[] group1 = {"Jon", "Joe", "James"};
        String[] group2 = {"Aaron", "Shay", "Breanna"};
        String[] group3 = {"Cassandra", "Tahir", "Aygun"};

String[][] groups = new String[3][]; // array size is fixed (nr of elements) // index: 0, 1, 2 // hint: we know the number of elements before

        groups[0] = group1;
        groups[1] = group2;
        groups[2] = group3;


       // System.out.println(Arrays.toString(groups)); // toString() string method is for one dimensional arrays only
        System.out.println(Arrays.deepToString(groups));

        System.out.println("------------------------------------------------------------");


        /*
        {1, 2, 3}
        {4, 5, 6, 7}
        {8, 9, 10, 11, 12}
         */

        //single dimensional is for elements
        //multidimensional is for arrays
        // when you don't know how many elements are there


        //                 0, 1, 2  ,  0, 1, 2, 3  ,  0, 1, 2,  3,  4
        int[][] arr2D = { {1, 2, 3} , {4, 5, 6, 7} , {8, 9, 10, 11, 12} };
        //                     0            1               2

        // first bracket [1] ==> 4,5,6,7 first bracket ==> single dimensional array
        // second bracket [3] ==> 7 second bracket ==> element

        System.out.println(Arrays.deepToString(arr2D) );


        System.out.println(Arrays.toString(arr2D[1]));

        System.out.print(arr2D[2][3]); // 11



    }

}
/*
String[] group1 = {"Jon", "Joe", "James"}
String[] group2 = {"Jon", "Joe", "James"}
String[] group3 = {"Jon", "Joe", "James"}
creating container for one dimensional array you need 2 dimensional arrays


 */