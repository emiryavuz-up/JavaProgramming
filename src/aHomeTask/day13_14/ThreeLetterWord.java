package aHomeTask.day13_14;

import java.util.Scanner;

public class ThreeLetterWord {

    public static void main(String[] args) {

        /*
        write a program that asks the user enter a three letter word.
        Check if the middle character of the given word is 'a'.
        In the case it is print: "Cool word",
         §but in the case the middle letter is not 'a' print: "Okay word".
     - If the user does not enter a 3 letter word tell them:
             If the word is less than 3 letters: "Word is too short"
             If the word is too long: "Word is too long"
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a three letters word:");
        String word = scan.next();
        scan.close();
        String result = "";

        if(word.length() < 3){
            result = "Word is too short";
        }else if(word.length() > 3){
            result = "Word is too long";
        }else{
            char middleChar = word.charAt(word.length()-1);

            if(middleChar == 'a'){
                result = "Cool Word";
            }else{
                result = "Okay Word";
            }
        }
        System.out.println(result);
        scan.close();
        }

    }



