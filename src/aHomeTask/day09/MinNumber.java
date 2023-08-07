package aHomeTask.day09;

public class MinNumber {

    public static void main(String[] args) {

        /*
        Write a program that can print the minimum number between two numbers, if both are equal then print Equal

			Ex:
				n1= 100, n2 = 200;

			output:
				100 is the minimum number
         */

        // n1 & 2
        // possitibility #1: n1 is Min
        // possitibility #2: n2 is Min
        // possitibility #3: equal


        int number1 = 300,
                number2 = 200;


        boolean possibility1 = number1 < number2,
                possibility2 = number2 < number1,
                possibility3 = number1 == number2;

        if (possibility1) { // if number 1 is the minimum number
            System.out.println(number1 +" is the minimum number");
        }
        if (possibility2) { // if number 2 is the minimum number,
            System.out.println(number2 +" is the minimum number");
        }
        if (possibility3) {
             System.out.println(possibility3 + " equal");
            }
        }

    }


