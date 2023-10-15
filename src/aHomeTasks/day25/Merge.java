package aHomeTasks.day25;

import java.util.Arrays;

public class Merge {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5};

        int[] arr2 = {6,7,8,9,10};

        int[] together = merge(arr1, arr2);

        System.out.println(Arrays.toString(together));
        

    }

    public static int[] merge(int[] arr1, int[] arr2){

    int[] together = new int[arr1.length + arr2.length];


    int i = 0;

        for (int each : arr1) {
         together[i] = each;
         i++;
        }

        for (int each : arr2) {
            together[i] = each;
            i++;
        }

        return together;

    }

    public static String[] merge(String[] arr1, String[] arr2){

        String[] together = new String[arr1.length + arr2.length];


        int i = 0;

        for (String each : arr1) {
            together[i] = each;
            i++;
        }

        for (String each : arr2) {
            together[i] = each;
            i++;
        }

        return together;

    }

   

}


/*
Task1:
	1. create a method that can merge two integer arrays. 	merge(int[] arr1, arr2)

	2. create a method that can merge two double arrays.  	merge(double[] arr1, double[] arr2)

	3. create a method that can merge two char arrays.    	merge(char[] arr1, char[] arr2)

	4. create a method that can merge two String arrays. 	merge(String[] arr1, String[] arr2)

		merge()
 */