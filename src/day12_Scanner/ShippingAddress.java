package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {

    public static void main(String[] args) {

        //  TIP: after next method clear out the scanner's memory by adding additional nextline method

        Scanner randomKeyword = new Scanner(System.in); // Enter

        System.out.println("Enter your full name:"); // SMYRNA KOCA KAFA
        String fullName = randomKeyword.nextLine(); // Java ProgrammingEnter // scanner will be empty anyway

        System.out.println("Enter your building number:");
        String buildingNumber = randomKeyword.next(); // 7925AEnter // enter will be ignored here so clear out!
        randomKeyword.nextLine(); // 2214B

        System.out.println("Enter your street name:");
        String street = randomKeyword.nextLine(); // AVNI ANIL SOKAK

        System.out.println("Enter your city name:");
        String city = randomKeyword.nextLine(); // scanner will be empty because it ends with nextline

        System.out.println("Enter your State:"); // MARS
        String state = randomKeyword.next(); // NEXT LINE IS ADDED BECAUSE ITS NEXT SO ENTER WILL BE IGNORED
        randomKeyword.nextLine();

        System.out.println("Enter your zip code"); // 335544
        String zip = randomKeyword.next();
        randomKeyword.nextLine();

        System.out.println("Enter your country"); // ZIMBABWE
        String country = randomKeyword.nextLine(); // ADDITIONAL NEXT LINE IS NOT NEEDED ITS ALREADY NEXTLINE

        randomKeyword.close();

        System.out.println(fullName + "\n" + buildingNumber);


        /*
        enter your full name ( nextLine() )
        enter your building number ( next() ) // in case it contains some letters its next and not int
        enter your street number ( nextLine() )
        enter your city name (nextLine() )
        enter your state name (VA) (CA) (next() )
        enter your zip code ( next() )

        Display the shipping address
         */

    }


}
