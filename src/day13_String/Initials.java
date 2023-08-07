package day13_String;

import java.util.Scanner;

public class Initials {

    /*
    initial:
		firstName = "Simushy";
		lastName = "Smyrna";

	output:
		W.S                     // character index numbers always start from zero 0 zero 0 zero 0
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName = scan.next();

        System.out.println("Enter your last name");
        String lastName = scan.next();

        char f = firstName.charAt(0); // GETS THE SPECIFIC CHARACTER FROM THE STRING
        char l = lastName.charAt(0); // GETS THE SPECIFIC CHARACTER FROM THE STRING

      //  String initial = f + l; // will give you compiler error there is no string in the beginning or at the end
                                // first give an empty string to add the rest
        String initial = "" + f + l; // IS THEREFORE THE CORRECT WAY TO WRITE

        System.out.println("initial = " + initial);

        scan.close();

    }


}
