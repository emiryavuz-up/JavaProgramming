package JavaRecap;

import java.util.Scanner;

public class day13_ReverseString {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = scan.nextLine();
        String result = "";

        if(str.length() == 5){
            result += str.charAt(4);
            result += str.charAt(3);
            result += str.charAt(2);
            result += str.charAt(1);
            result += str.charAt(0);

        }else if(str.length() < 5){
            System.out.println("Too short!");
        }else{
            System.out.println("Too long!");
        }

        System.out.println(result);

        scan.close();
    }

}

/*
1.  Create a class called Reverse, write a program that will reverse a string.
Your program should reverse a string only 5 characters long.
	If word is shorter, display message: "Too short!".
	If word is longer, display message: "Too long!".
	Otherwise, reverse this word and print out result into the console.
 */
