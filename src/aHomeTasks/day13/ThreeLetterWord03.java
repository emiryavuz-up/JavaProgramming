package aHomeTasks.day13;

import java.util.Scanner;

public class ThreeLetterWord03 {

    public static void main(String[] args) {

        /*
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

        System.out.println("Enter a three letter word:");
        String word = scan.nextLine();
        scan.close();

        if(word.charAt(1) == 'a' || word.length() >3 ){

            if(word.length() == 3) {
                System.out.println("Cool Word");

            }else if(word.charAt(1) != 'a'){
                System.out.println("Okay Word");
            }
            }else if(word.length() > 3){
                System.out.println("Word is too long");

            }else{
                System.out.println("Word is too short");
            }
        scan.close();
        }

    }




