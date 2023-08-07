package aHomeTask.day16;

import java.util.Scanner;

public class SumOfString {

    public static void main(String[] args) {

        String str = "RREAGAF643";
        int sum = 0;

        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < str.length(); i ++){

            char ch = str.charAt(i);

            if(ch >= '0' && ch <= '9'){
                sum += ch-48;
            }
        }

        System.out.println(sum);

        scan.close();
    }

}

/*
 Write a program that can return the sum of digits from a  string
             Ex:
                 input: A1B2C3

                 output:    6

             Hint: You need to get each of the character by using a loop
	             	To convert char to number:
						             	   '0' - 48   ==> 0
						             	   '1' - 48   ==> 1
						             	   		...
 */