package aHomeTask.day13_14;

import java.util.Scanner;

public class SameLength {

    public static void main(String[] args) {

        /*
        write a program that can check if the first and last characters of the string are same
            ex:
                level
            output:
                same
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the word");
        String word = scan.nextLine();

        scan.close();

        char firstChar = word.charAt(0);
        char lastChar = word.charAt(word.length()-1); // last character

        if(firstChar == lastChar){
            System.out.println("same");
        }else{
            System.out.println("not the same");
        }
        scan.close();
    }

}
