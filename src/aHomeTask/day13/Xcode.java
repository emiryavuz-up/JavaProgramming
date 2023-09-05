package aHomeTask.day13;

import java.util.Scanner;

public class Xcode {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word:");
        String word = scan.next();

        char firstChar = word.charAt(0);
        String word1 = word.substring(1);

        if(firstChar == 'x'){
            System.out.println(word1);
        }
        scan.close();
    }

}

/*
Ask user to enter a word. If the word starts with x, print the word without x.
                    Input:
                        xcode
                    Output:
                        code
 */
