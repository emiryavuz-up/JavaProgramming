package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveElements02 {

    public static void main(String[] args) {

        int[] array = {123456,45689,76589, 131236, 1416346, 316151};


        System.out.println(Arrays.toString(removeElement(array, 0)));


    }



    public static int[] removeElement(int[] array, int index){

        if(index < 0 || index > array.length-1){ // in case invalid index is passed
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }

        int[] result = {};

        for (int i = 0; i < array.length; i++) {
            if( i != index){ // long as index number isn't matching with each character
               result = ArraysUtility.addElement(result, array[i]); // add that index which does not equal to each character, add that element to result

            }
        }
        return result;
    }

}
