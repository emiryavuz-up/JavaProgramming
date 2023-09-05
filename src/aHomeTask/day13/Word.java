package aHomeTask.day13;

import java.util.Scanner;

public class Word {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = scan.next();



        char firstCh = word.charAt(0); // first character

        String result = "";

        if(firstCh >= '0' && firstCh <= '9'){
            result = "First character is a digit";
        }else if(firstCh >= 'A' && firstCh <= 'Z'){
            result = "first character is lowercase letter";
        }else if(firstCh >= 'a' && firstCh <= 'z'){
            result = "first character is uppercase letter";
        }else{
            result = "first character is special character";
        }
        System.out.println(result);

        scan.close();
       }


    }



/*
Ask user to enter a word,
        if the word starts with digits, print "first character is digit"
        if the word starts with uppercase letters, print "first character is lowercase letter"
        if the word starts with lowercase letters, print "first character is uppercase letter"
        if the word starts with special characters, print "first character is special character"

        HINT: 1. you need charAt() method
              2. Ascii Table
 */