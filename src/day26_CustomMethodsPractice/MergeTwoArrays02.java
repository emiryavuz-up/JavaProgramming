package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class MergeTwoArrays02 {

    public static void main(String[] args) {

        int[] array1 = {1,2,3,4};
        int[] array2 = {5,6,7,8};

        int[] array3 = merge(array1, array2);

        System.out.println(Arrays.toString(array3));

        System.out.println("--------------------------");

        String[] a1 = {"A", "B", "C", "D"};
        String[] a2 = {"E", "F", "G", "H"};

        String[] mergeStringArrays = merge(a1, a2);

        System.out.println(Arrays.toString(mergeStringArrays));

    }

    public static int[] merge(int[] array1, int[] array2){

        int[] result = {};

        for (int each : array1) {
           result = ArraysUtility.addElement(result, each); // "result = " is given to update it after adding elements
        }

        // after finishing each character of array1, we move to 2nd

        for (int each : array2) {
            result = ArraysUtility.addElement(result, each);
        }

        return result;
    }
    public static double[] merge(double[] array1, double[] array2){

        double[] result = {};

        for (double each : array1) {
            result = ArraysUtility.addElement(result, each); // "result = " is given to update it after adding elements
        }

        // after finishing each character of array1, we move to 2nd

        for (double each : array2) {
            result = ArraysUtility.addElement(result, each);
        }

        return result;
    }
    public static String[] merge(String[] array1, String[] array2){

        String[] result = {};

        for (String each : array1) {
            result = ArraysUtility.addElement(result, each); // "result = " is given to update it after adding elements
        }

        // after finishing each character of array1, we move to 2nd

        for (String each : array2) {
            result = ArraysUtility.addElement(result, each);
        }

        return result;
    }
    public static char[] merge(char[] array1, char[] array2){

        char[] result = {};

        for (char each : array1) {
            result = ArraysUtility.addElement(result, each); // "result = " is given to update it after adding elements
        }

        // after finishing each character of array1, we move to 2nd

        for (char each : array2) {
            result = ArraysUtility.addElement(result, each);
        }

        return result;
    }

}
