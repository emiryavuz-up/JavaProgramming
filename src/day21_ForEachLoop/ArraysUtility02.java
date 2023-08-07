package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility02 {

    public static void main(String[] args) {

        String[] students = {"Elif", "Sinem", "Gunay", "Cihad", "David", "James", "Aaron", "Daniel"};

        String[] firstThreeNames = Arrays.copyOf(students, 3); // [Elif, Sinem, Gunay]
        // copies the elements of another Array starting from 0
        // if the given number for firstThreeNames bigger than the students Array, it prints the rest as null

        System.out.println(Arrays.toString(firstThreeNames));

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        numbers = Arrays.copyOf(numbers, 5); // from 0 to 5th element copied from numbers
                                                        // result is assigned back to numbers variable

        System.out.println(Arrays.toString(numbers));


        System.out.println("----------------------------------------");

        char[] ch1 = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I'};

        char[] ch2 = Arrays.copyOfRange(ch1, 2, 6+1); // copies ch1 elements from 2 to 6

        System.out.println(Arrays.toString(ch2)); // [C, D, E, F, G]

        System.out.println("-----------------------------------");

        int[] scores = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
                    //   0,  1,  2,  3,  4,  5,  6,  7,  8,  9

        int[] result = Arrays.copyOfRange(scores, 3, 7+1);
        System.out.println(Arrays.toString(result));

        int[] result2 = Arrays.copyOfRange(scores, 5, 10); // last index number is excluded
        System.out.println(Arrays.toString(result2)); // 10 is given but 100 is printed since last nr excluded



    }

}
