package day26_CustomMethodsPractice;

import java.util.Arrays;

public class RemoveElements01 {


    public static void main(String[] args) {

        int[] numbers = {100, 200, 300, 400, 500 ,600}; // size of 6

        numbers = removeElements(numbers, 1); // size of 5

        numbers = removeElements(numbers, 1); // size of 4

        System.out.println(Arrays.toString(numbers));


    }
    // removes the index from the array, returns new array at the end
    public static int[] removeElements(int[] array, int index){

        if(index < 0 || index > array.length-1){ // in case invalid index is passed
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }

        int[] result = new int[array.length -1 ]; // size is subtracted by one because we will remove one element

        // first get every single element from array
        // exclude one number by index

        int j = 0; // to represent array characters
        for (int i = 0; i < array.length; i++) {
            if(i == index){ // if the index of array is matching with the given index
                continue;
        }
            result [j++] = array[i];// now array contains all the elements except for the element at the given index
        }

        return result;

    }

    public static double[] removeElements(double[] array, int index){

        if(index < 0 || index > array.length-1){ // in case invalid index is passed
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }

        double[] result = new double[array.length -1 ]; // size is subtracted by one because we will remove one element

        // first get every single element from array
        // exclude one number by index

        int j = 0; // to represent array characters
        for (int i = 0; i < array.length; i++) {
            if(i == index){ // if the index of array is matching with the given index
                continue;
            }
            result [j++] = array[i];// now array contains all the elements except for the element at the given index
        }

        return result;

    }

    public static char[] removeElements(char[] array, int index){

        if(index < 0 || index > array.length-1){ // in case invalid index is passed
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }

        char[] result = new char[array.length -1 ]; // size is subtracted by one because we will remove one element

        // first get every single element from array
        // exclude one number by index

        int j = 0; // to represent array characters
        for (int i = 0; i < array.length; i++) {
            if(i == index){ // if the index of array is matching with the given index
                continue;
            }
            result [j++] = array[i];// now array contains all the elements except for the element at the given index
        }

        return result;

    }

    public static String[] removeElements(String[] array, int index){

        if(index < 0 || index > array.length-1){ // in case invalid index is passed
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }

        String[] result = new String[array.length -1 ]; // size is subtracted by one because we will remove one element

        // first get every single element from array
        // exclude one number by index

        int j = 0; // to represent array characters
        for (int i = 0; i < array.length; i++) {
            if(i == index){ // if the index of array is matching with the given index
                continue;
            }
            result [j++] = array[i];// now array contains all the elements except for the element at the given index
        }

        return result;

    }

}
