package aHomeTasks.day13;

import java.util.Scanner;

public class EnterSentence {

    public static void main(String[] args) {

        /*
        write a program that asks user to enter a sentence.
                then print the first & last characters of the sentence
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a Sentence");
        String name = scan.nextLine();

        scan.close();

        char firstChar = name.charAt(0);
        char lastChar = name.charAt(name.length()-1);

        String result = firstChar + " " + lastChar;
        System.out.println(result);


    }


}
