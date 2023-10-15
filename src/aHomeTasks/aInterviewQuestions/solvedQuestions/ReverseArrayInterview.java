package aHomeTasks.aInterviewQuestions.solvedQuestions;

import java.util.Arrays;

public class ReverseArrayInterview {

    public static void main(String[] args) {


        int[] numbers = {10, 20, 30, 40};
                    //   0,  1,  2,  3
        int[] reversed = new int[numbers.length]; // make sure that this array has enough capacity to contain first array ==> this is the same length as numbers

        /*
                 j            i
        reversed[0] = numbers[3]; // [numbers.length-1] = get the last element from the array and put it into the next array at index 0 to get reversed
        reversed[1] = numbers[2];
        reversed[2] = numbers[1];
        reversed[3] = numbers[0];
        */

        for (int i = numbers.length - 1, j = 0 ; i >= 0; i-- , j++) {
            reversed[j] = numbers[i];
        }

        System.out.println(Arrays.toString(reversed));





    }

}
