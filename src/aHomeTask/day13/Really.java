package aHomeTask.day13;

import java.util.Scanner;

public class Really {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word:");
        String word = scan.next();

        int length = word.length();

        char lastChar = word.charAt(length-1);
        char lastbefore = word.charAt(length-2);

        scan.close();

        String result = "";

     if(lastChar == 'y' && lastbefore == 'l'){
         result = "really???";
     }else {
         result = "never mind";
     }
        System.out.println(result);

    }

}
/*
ask the user to enter a word.
if the word ends with "ly", print "really???" ,
otherwise, print "never mind"
 */