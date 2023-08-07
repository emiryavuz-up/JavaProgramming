package aHomeTask.day19;

import java.util.Scanner;

public class FirstDuplicatedChar {

    public static void main(String[] args) {



            String input = "SDBBCCkjeakjgeakjg";

            char firstDup = '\0'; // empty int sum = 0;

        for (int i = 0; i < input.length(); i++) { // same output  "S" "D"

            char currentChar = input.charAt(i); // same output

            for (int j = 1; j < input.length(); j++) { // 15x input "SDBBCCkjeakjgeakjg" "SDBBCCkjeakjgeakjg"

                if(currentChar == input.charAt(j)){
                    firstDup = currentChar; // first duplicate is current char
                    break;
                }

            }

            if(firstDup != '\0'){ // firstDup is not empty
                break;
            }

        }

            if(firstDup != '\0'){
                System.out.println("First duplicate charater is: " + firstDup);
            }else{
                System.out.println("No duplicate character is found.");
            }

    }
}

/*
1. Write a program that can return the first duplicated character from a string
 */