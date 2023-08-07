package day13_String;

import java.util.Scanner; // class to get user input

public class MyInfo {

    public static void main(StringIntro[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Enter your age:");
        int age = scan.nextInt(); // call the method from variable name SCAN // 27 then ENTER KEY


        System.out.println("Enter your gender:");       // Male ENTER KEY
        String gender = scan.next();

        scan.nextLine();            // this is to erase those 2 enter keys left in scanner scan.

        System.out.println("Enter your full name:");
        String name = scan.nextLine(); /* if next line method is being used after other methods of scanners
                if the previous method of scanner is not next line then you must provide next additional
                next line method
                so everytime when you are using the nextLine method if the previous scanner method is not
                nextLine method then you need to provide ONE MORE next line method above the print statement*/

        System.out.println("Enter your phone number");
        long phone = scan.nextLong();


        System.out.println("Enter your zip code");
        int zip = scan.nextInt();

        System.out.println("Enter your school name");
        String schoolname = scan.nextLine(); // MORE THAN ONE WORD SO ITS NEXT LINE.
                                            // IF YOU USE nextLINE CHECK PREVIOUS METHOD OF SCANNERS
        scan.nextLine();                    // IF IT'S NOT nextLINE THEN YOU HAVE TO PROVIDE ONE ADDITIONAL
                                            // nextLINE METHOD TO ERASE THE MEMORY OF THE SCAN SCANNER

        System.out.println("Enter your city name");
        String city = scan.nextLine();


        System.out.println("Enter your state name");
        String state = scan.next();


        System.out.println("Enter your building number");
        int buildingNumber = scan.nextInt();

        scan.nextLine(); // nextLINE IS USED BELOW SO THIS IS ADDED TO ERASE THE MEMORY FROM ENTER KEYS

        System.out.println("Enter your street name");
        String street = scan.nextLine();

        System.out.println("Full name = " + name);
        System.out.println("Age = " + age);
        System.out.println("Gender = " + gender);
        System.out.println("Phone number = " + phone);
        System.out.println("Address: \n\t" + buildingNumber + " " + street + "\n\t" + city + ", " + state + " " + zip);
        System.out.println("School Name = " + schoolname);


scan.close();
    }

}

/*
warmup tasks:
	1. Create a class called MyInfo. Write a program that can ask the user to:
			1. Enter your age (int) (int ----> nextInt()
			2. Enter your gender (String- One word ONLY)                     ----> next() // nextLine()
			3. Enter your full name (String - Multiple words)                ----> nextLine()
			4. Enter your phone number (long)                                ----> nextLong()
			5. Enter your zip code (int)                                     ----> nextInt() // nextLine()
			6. Enter your School name (String - Can be Multiple words)       ----> nextLine()
			7. Enter your city name (String - Can be Multiple words)         ----> nextLine()
			8. Enter your state name (String- One word ONLY)                 ----> next()
			9. Enter your building number (int)                              ----> nextInt() (nextLine()
			10. Enter your Street name                                       ----> nextLine()



		MAKE SURE USER CAN ENTER ALL THE INPUT

		Display all the inputs that user entered in following order in seperate lines:

			1. full name
			2. age
			3. gender
			4. phone number
			5. address:
						buildingNumber Street
						City, State ZipCode

			6. school name
 */


