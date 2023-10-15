package aHomeTasks.day13;

import java.util.Scanner;

public class ThreeLetterWord04 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a three word letter");
        String word = scan.next();
        scan.close();

        if(word.length() != 3){
            if(word.length() > 3){
                System.out.println("Word is too long");
            }else{
                System.out.println("Word is too short");
            }
        }else{
            char middleChar = word.charAt(1);

            if(middleChar == 'a'){
                System.out.println("Cool Word");
            }else{
                System.out.println("Okay Word");
            }

        }

        scan.close();



    }
}
