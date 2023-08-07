package aHomeTask.day16;

import java.util.Scanner;

public class FactorialNumber {

    public static void main(String[] args) {

        /*
        int factorial = 1;
        int givenNr = 500;
        for(int i = givenNr; i < factorial; i--){
            factorial *= i; // her bir geri gidiste o rakami carp ve factorial olarak olusturdugum seye ekle
        }
*/

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number");

        double num = scan.nextInt();

        double result = 1;

        for(int i = (int)num; i >= 1; i--){
            result += i;
        }

        System.out.println("result = " + result);

        scan.close();


    }


}

/*
Write a program that can return the factorial number of any given number

            Ex:
                input: 5
                output: 120

                	( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
 */