package day20_Arrays;

import java.util.Scanner;

public class MinMaxNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] numbers = new int [10];

        for (int i = 0; i < numbers.length; i++) { // last index is always less than length not equal
            System.out.println("Enter a number");
            numbers[i] = scan.nextInt(); //each user entered input will be assigned to the indexes of the array numbers, variable i: represents all the index nr, each
        }

        int max = numbers[0]; // in the beginning, it's just an assumption
        int min = numbers[0]; // assumption to compare to every single element of the array numbers

        for (int i = 0; i < numbers.length; i++) {

            if(numbers[i] > max){
                max = numbers[i]; // each time when you find max number, update max with it.

            }

            if(numbers[i] < min){
                min = numbers[i]; // each time when you find min number, update min with it.
            }

        }

        System.out.println("Minimum number is: " + min + "\nMaximum number is: " + max);
scan.close();
    }

}
/*
Write a program that asks user to enter a number 10 times:
			1. store all user entered numbers in an array
			2. find the max number
			3. find the min number

 */