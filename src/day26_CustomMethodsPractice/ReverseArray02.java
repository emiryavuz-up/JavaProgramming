package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class ReverseArray02 {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};

        System.out.println(Arrays.toString(reverse(array)));

    }

    
    // reverses the array, returns a new array
    public static int[] reverse(int[] array){

        int[] result = {};

        for (int i = array.length -1; i >= 0; i--) {
           result = ArraysUtility.addElement(result, array[i]); // each index number of array will be added to the new array result
        }
        return result;
    }

    public static double[] reverse(double[] array){

        double[] result = {};

        for (int i = array.length -1; i >= 0; i--) {
            result = ArraysUtility.addElement(result, array[i]); // each index number of array will be added to the new array result
        }
        return result;
    }

    public static String[] reverse(String[] array){

        String[] result = {};

        for (int i = array.length -1; i >= 0; i--) {
            result = ArraysUtility.addElement(result, array[i]); // each index number of array will be added to the new array result
        }
        return result;
    }

    public static char[] reverse(char[] array){

        char[] result = {};

        for (int i = array.length -1; i >= 0; i--) {
            result = ArraysUtility.addElement(result, array[i]); // each index number of array will be added to the new array result
        }
        return result;
    }
    
    
}
