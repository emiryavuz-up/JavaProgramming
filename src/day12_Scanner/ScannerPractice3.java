package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3 {

    public static void main(String[] args) {

        //nextLine() READS THE ENTIRE INPUT UNTIL THE NEW LINE (PRESS ENTER)
        // EVEN THE ENTER KEY IT READS EVERY SINGLE THING.

        // 123Enter

        /*

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name:");

        String fullName = input.nextLine();
        */

        Scanner input = new Scanner(System.in); // Enter key that will be left here

        System.out.println("Enter your full name:"); //full name has more than one word so you need to use next line method here

        String fullName = input.nextLine(); // this will return us string data type. so string is used


        System.out.println("Enter Your Programming Language:"); // if you need more than 2 words

        String programming = input.nextLine();   // you need to use nextLine();

        System.out.println("Enter your age");

        int age = input.nextInt(); // 24Enter // ENTER WILL NOT BE TAKEN INTO ACCOUNT BUT IT WILL BE LEFT

        input.nextLine(); // ENTER WILL BE TAKEN OUT BY THIS TO EMPTY SCANNER. NOW YOU WILL BE ABLE TO PROVIDE THE NEXT INPUT

        System.out.println("Enter your country name");
        String countryName = input.nextLine(); // IN THE SCANNERS MEMORY BECAUSE THEY CANT READ THE ENTER


        System.out.println("fullName = " + fullName);
        System.out.println("programming = " + programming);
        System.out.println("age = " + age);
        System.out.println("countryName = " + countryName);

        input.close();
    }


}
