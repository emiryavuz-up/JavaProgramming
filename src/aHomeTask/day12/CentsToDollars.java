package aHomeTask.day12;

import java.util.Scanner;

/*
Write a program that can convert cents to dollars, if there is any remainder include them in the result as cents
            Ex:
                Enter cents
                225

                output:
                225 cents equal to: 2 dollars and 25 cents

 */

public class CentsToDollars {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Cents:");
        int cents = scan.nextInt(); // user ne yazacaksa onu asagida kullanmak icin data type a atanir.

        int dollars = cents / 100;
        int remainder = cents % 100;

        System.out.println(cents + " cents equal to: " + dollars + " dollars and " + remainder + " cents");

        scan.close();

        }

    }


