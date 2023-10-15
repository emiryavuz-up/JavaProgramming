package aHomeTasks.day13;

import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {

        /*
        Create a class called Reverse, write a program that will reverse a string.
    Your program should reverse a string only 5 characters long.
	If word is shorter, display message: "Too short!".
	If word is longer, display message: "Too long!".
	Otherwise, reverse this word and print out result into the console.
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string that is 5 characters long.");
        String input = scan.next();

        String result = "";
            /*
            jalal
            01234
             */
        //  2 += 1; // J ye esit.

        if(input.length() == 5){
            result += input.charAt(4); // += sondan baslayip sola dogru gider 4. karakteri bulur aslinda 5
            result += input.charAt(3); // += sondan baslayip sola dogru gider 3. karakteri bulur aslinda 4
            result += input.charAt(2); // -= ise sondan baslar saga dogru gider. yani -= -1 o zaman last ch.
            result += input.charAt(1);
            result += input.charAt(0);
        }else if(input.length() > 5){
            result = "Too long!";
        }else{
            result = "Too short!";
        }
        System.out.println(result);
        scan.close();
    }

}
