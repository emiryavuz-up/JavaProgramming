package day20_Arrays;

import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {

    // store the elements: 10, 20, 50, 70

    int[] number = {10, 20, 30, 50, 70};

        System.out.println(Arrays.toString(number)); // [10, 20, 30, 50, 70]

        System.out.println("----------------------------------------");

        // create a variable that can contain 5 scores
        // you don't know the names

        int[] scores = new int[5];
        // assign 85 to the 2nd
        scores[1] = 85; // // [0, 85, 0, 0, 0]
        scores[scores.length-1] = 95; // length -1 == last index
        scores[3] = 75;
        scores[0] = 65;
        scores[2] = 55;

        System.out.println(Arrays.toString(scores)); // [65, 85, 55, 75, 95] // default value of int


        System.out.println("-------------------------");

        String[] months = {"January", "February", "March", "April", "May", "June", "July",
            "August", "September", "October", "November", "December"}; // 0 ~ 11

        //System.out.println(months[0]); // January
        //System.out.println(months[1]); // february
        // 2, 3, 4...
        //instead
        for (int i = 0; i < months.length; i++) { // i: index numbers of the array starting from 0
            System.out.println( months[i] ); // January\n February\n March\n...

        }

        System.out.println("-------------------------------------");

        for (int i = months.length-1; i > 0; i--) { // i: represents the index numbers of array starting from last index to 0
            System.out.println(months[i]); // Reverse order of months new line between them
        }

        System.out.println("-------------------------------------------------");



    }

}
