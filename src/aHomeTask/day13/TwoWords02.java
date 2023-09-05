package aHomeTask.day13;

import java.util.Scanner;

public class TwoWords02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first word");
        String word1 = scan.next();

        System.out.println("Enter second word");
        String word2 = scan.next();

        int length = word1.length();

        char lastFirst = word1.charAt(length-1);
        char firstLast = word2.charAt(0);

        String total = word1 + word2.substring(1);

        if(lastFirst == firstLast){
            System.out.println(total);
        }

        scan.close();

    }
}
/*
 Ask user to enter two words. Then add them together and print.
    But if the last letter of the first word and the first letter of the last word is the same,
    print that character once.

                    Input:
                        one
                        eight
                    Output:
                        oneight

 */