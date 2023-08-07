package day15_ForLoop;

import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {

        int sum = 0; // when first number is 0, you get that number itself.

        for (int i = 1; i <= 100; i++) { // i: 1, 2, 3, 4, 5, 6... 100;
            sum += i; // updates the value of the sum by i +1 +2 +3 ... +100
        }
        System.out.println(sum);

        System.out.println("----------------------------------------");

        int total = 0;
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number");
            total += scan.nextInt(); // get the input and add to the total
        }

        System.out.println(total);

        scan.close();


    }

}
