package day15_ForLoop;

import java.util.Scanner;

public class MinimumNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int min = 2147483647; //

        for(int i = 10; i < 15; i++){ // 5 numbers will be entered by the user when used with below codes
                            // used to make the previous conditions false i++ is given // i-- = infinite loop
            System.out.println("Enter a number:");
            int num = scan.nextInt();//15 will be min, 78 will be min, 10 will 'not' be min, 10106 will be min

            if(num < min){
                min = num;
            }

        }

        System.out.println("Minimum number is: "+ min);
scan.close();
    }
}

/*
Write a program that asks the user to enter a number for 5 times.
return the minimum number
 */
