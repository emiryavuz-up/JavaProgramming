package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice2 {

    public static void main(String[] args) {




        /*
        System.out.println("Enter true or false:");
        boolean result = input.nextBoolean(); // BOOLEAN ONLY EXPECTS "TRUE" OR "FALSE" NOT EXPRESSIONS
        */
        // when you want to get more than one input to use this below example!!!!!!!!!!!

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your Name:");
        String name = input.next(); // java programming // I EXPECT ONLY ONE WORD FROM THE USER ONLY JAVA

        System.out.println("name = " + name); // JAVA WILL BE PRINTED NOT PROGRAMMING BECAUSE OF "NEXT()"
        // NEXT MEANS IT STOPS AT THE FIRST SPACE!!!! READS UNTIL THE SPACE. TILL SPACE 'TILL THE FIRST SPACE


        input.close();

    }


}
