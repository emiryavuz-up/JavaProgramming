package day20_Arrays;

import java.util.Arrays;

public class ArraysUtility {

    public static void main(String[] args) {

        int[] numbers = {10, 9, 0, 1, 2, 3, 4, 5,};

        System.out.println(Arrays.toString(numbers)); // [10, 9, 0, 1, 2, 3, 4, 5]

        Arrays.sort(numbers); // [0, 1, 2, 3, 4, 5, 9, 10]

        System.out.println(Arrays.toString(numbers));

    }

}
