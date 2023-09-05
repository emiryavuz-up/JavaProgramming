package aHomeTask.day13;

import java.util.Scanner;

public class TwoWords {

    public static void main(String[] args) {

        /*
        Ask user to enter two words. Print first word without its first character
        then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Print first word");
        String word1 = scan.next();

        System.out.println("Print second word");
        String word2 = scan.next();
        scan.close();
        String result = word1.substring(1) + word2.substring(1);

        System.out.println(result);
        scan.close();
    }

}
