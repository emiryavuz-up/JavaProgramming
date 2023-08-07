package aHomeTask.day13_14;

import java.util.Scanner;

public class ThreeLetterWord02 {

    public static void main(String[] args) {

        /*
        write a program that asks the user enter a three letters word.
        Check if the middle character of the given word is 'a'.
         In the case it is print: "Cool word",
         but in the case the middle letter is not 'a' print: "Okay word".
     - If the user does not enter a 3 letters word tell them:
             If the word is less than 3 letters: "Word is too short"
             If the word is too long: "Word is too long"
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a three letter word");
        String word = scan.next();
        scan.close();
        String result = "";
        int length = word.length();

        char middleChar = word.charAt(1); // middle char

        if(middleChar == 'a' && length == 3){
            result = "Cool word";
        }else{
            result = "Okay word";
        }

        if(length > 3){
            result = "Word is too long";
        }else{
            result = "Word is too short";
        }

        System.out.println(result);
        scan.close();

    }

}
