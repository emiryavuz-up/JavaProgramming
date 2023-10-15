package aHomeTasks.day13;

import java.util.Scanner;

public class EnterString {

    public static void main(String[] args) {

        /*
        Write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string"); // first display message
        String input = scan.nextLine(); // user input

        scan.close();


        int length = input.length(); // input'un length ini cikarmak icin yeni bir variable length created.
        String result = "";

        if(length == 0){
            result = "String is empty";

        }else if(length > 3){
            result = "" + input.charAt(length - 3) + input.charAt(length -2) + input.charAt(length - 1);

        }else{
            result = input;
        }
        System.out.println(result);
    }

}
