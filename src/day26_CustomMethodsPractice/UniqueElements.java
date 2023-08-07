package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElements {

    public static void main(String[] args) {


        int[] array = {1,1,2,3,3,4,5,5,6,7,7,7};

        int[] unique = uniqueElements(array);

        System.out.println(Arrays.toString(unique));

        double[] array2 = {1.5, 2.5, 1.5, 3.5, 4.5, 4.5, 5.5, 5.5};

        double[] unique2 = uniqueElements(array2);

        System.out.println(Arrays.toString(unique2));

    }
    
    public static int[] uniqueElements(int[] array){

        // at the end we need to return it as an array
        // we don't know how many elements we have
        // so empty array is created to store the uniqueElements next

        int[] result = {}; // new int[0]


        for (int each : array) {

            if(ArraysUtility.frequencyOfElement(array, each) == 1){ // if the frequency equal to 1 = unique element
                result = ArraysUtility.addElement(result, each); // added all the unique elements to result

            }
        }
        return result;
    }

    public static double[] uniqueElements(double[] array){

        // at the end we need to return it as an array
        // we don't know how many elements we have
        // so empty array is created to store the uniqueElements next

        double[] result = {}; // new int[0]


        for (double each : array) {

            if(ArraysUtility.frequencyOfElement(array, each) == 1){ // if the frequency equal to 1 = unique element
                result = ArraysUtility.addElement(result, each); // added all the unique elements to result

            }
        }
        return result;
    }

    public static char[] uniqueElements(char[] array){

        // at the end we need to return it as an array
        // we don't know how many elements we have
        // so empty array is created to store the uniqueElements next

        char[] result = {}; // new int[0]


        for (char each : array) {

            if(ArraysUtility.frequencyOfElement(array, each) == 1){ // if the frequency equal to 1 = unique element
                result = ArraysUtility.addElement(result, each); // added all the unique elements to result

            }
        }
        return result;
    }

    public static String[] uniqueElements(String[] array){

        // at the end we need to return it as an array
        // we don't know how many elements we have
        // so empty array is created to store the uniqueElements next

        String[] result = {}; // new int[0]


        for (String each : array) {

            if(ArraysUtility.frequencyOfElement(array, each) == 1){ // if the frequency equal to 1 = unique element
                result = ArraysUtility.addElement(result, each); // added all the unique elements to result

            }
        }
        return result;
    }
}
/*
create a method that can find unique elements from an integer array
 */