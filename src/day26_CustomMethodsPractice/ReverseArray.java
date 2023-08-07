package day26_CustomMethodsPractice;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

    int[] array = {1,2,3,4,5,6};

        System.out.println(Arrays.toString(reverse(array)));

    }

    public static int[] reverse(int[] array){

        int[] result = new int[array.length]; // result array with enough capacity to contain given int array, to contain reversed later on

        // we start from the last index since int array should be written in reversed order


        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
          result[j] = array[i]; // each of the element array[i] is assigned to each indexes of result starting from index 0
        }

            return result;
    }

}
