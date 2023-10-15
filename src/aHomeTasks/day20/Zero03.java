package aHomeTasks.day20;

import java.util.Arrays;

public class Zero03 {

    public static void main(String[] args) {


        int[] arrays = {10, 0, 5, 0, 1, 0}; // arrays

        int[] result = new int[arrays.length]; // array with enough capacity to contain arrays

        int i = 0;

        for (int j = 0; i < arrays.length; i++) { // both int i and int j starts from index number of 0
                                                 //  and goes to arrays.length incrementing by 1 each time

            if(arrays[i] != 0){ // if each index number of arrays isn't 0
                result[j++] = arrays[i];

            }

        }

        System.out.println(Arrays.toString(result));

    }

}
