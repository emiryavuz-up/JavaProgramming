package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice03 {

    public static void main(String[] args) {

        // scanner and array

        Scanner scan = new Scanner(System.in);

        System.out.println("How many numbers would you like to enter?");
        // if the user enters 10, we need to use those numbers 10 times and store it
        int length = scan.nextInt();

        if(length <= 0){ // if the length is invalid, it will exit. if it is valid, it will execute next code
            System.err.println("Invalid Entry");
            System.exit(0);
        }

        int[] numbers = new int[length]; // array needs to have enough capacity to contain all the elements user provided

        for (int i = 0; i < length; i++) {
            System.out.println("Enter a number");
           numbers[i] = scan.nextInt(); // each input user provided during each execution of the loop, will be assigned to numbers, user input will be i which is each number of the input.
        }

        System.out.println(Arrays.toString(numbers));
        scan.close(); // after using scanner, we can close
    }

}
