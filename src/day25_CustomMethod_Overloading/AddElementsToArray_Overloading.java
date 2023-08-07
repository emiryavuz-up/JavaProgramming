package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class AddElementsToArray_Overloading {

    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6}; // we will add 7

        numbers = addElement(numbers, 7);


        char[] chars = {'A', 'B', 'C', 'D'}; // we will add E

        chars = addElement(chars, 'E');

        String[] names = {"Smyrna", "Koca", "Kafa", "Leika"}; // we will add Maya

        names = addElement(names, "Maya");

        System.out.println("numbers = " + Arrays.toString(numbers));
        System.out.println("chars = " + Arrays.toString(chars));
        System.out.println("names = " + Arrays.toString(names));



    }
    // adds the given element to array, returns a new array
    public static int[] addElement(int[] array, int element){

        int[] result = new int[array.length + 1]; // enough capacity to contain both array and element


        int i = 0; // created to access index numbers
        for (int each : array) { // because each loop can't access the access numbers

            result[i++] = each; // i: is indexes of the new array

            result[i] = element; // last index is i, because it stops at the last element after each loop so we assign the element to the last index

        }

        return result;

    }

    // adds the given element to array, returns a new array
    public  static double[] addElement(double[] array, double element){

        double[] result = new double[array.length + 1];

        int i = 0;

        for (double each : array) {
            result[i++] = each; // beginning indexes of arrays

        }

        result[i] = element;
        // result[result.length-1] = element;

        return result;

    }

    // adds the given element to array, returns a new array
    public  static String[] addElement(String[] array, String element){

        String[] result = new String[array.length + 1];

        int i = 0;

        for (String each : array) {
            result[i++] = each; // beginning indexes of arrays

        }

        result[i] = element;
        // result[result.length-1] = element;

        return result;

    }

    // adds the given element to array, returns a new array
    public  static char[] addElement(char[] array, char element){

        char[] result = new char[array.length + 1];

        int i = 0;

        for (char each : array) {
            result[i++] = each; // beginning indexes of arrays

        }

        result[i] = element;
        // result[result.length-1] = element;

        return result;

    }

}
