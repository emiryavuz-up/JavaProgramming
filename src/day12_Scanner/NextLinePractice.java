package day12_Scanner;

import java.util.Scanner;

public class NextLinePractice {



    public static void main(String[] args) {

        /*
        1. Ask the user to enter age (nextInt() )
        2. Ask the user to enter full name (nextLine() )
         */
                // if the scanner is not empty nextline method needs to be used to erase the enter

        /*
if you use nextLine() after the other methods like nextbyte short int etc. then you must clear out the
scanner first by entering another input.nextLine() right after data type like String or Int
 */

        // first declare the scanner
        Scanner input = new Scanner(System.in); // ENTER KEY WILL STAY HERE

        System.out.println("Enter your age:");
        int age = input.nextInt(); // 19 and then the ENTER KEY ON YOUR KEYBOARD IT WILL BE IGNORED!!!
        input.nextLine();

        System.out.println("Enter your full name:");
        String fullName = input.nextLine();

        System.out.println("Enter your GPA:");
        double gpa = input.nextDouble();
        input.nextLine(); // IT'S NOT TAKING THE ENTER KEY NORMALLY SO YOU NEED TO CLEAR OUT FIRST

        System.out.println("Enter your universe name:");
        String universeName = input.nextLine();


        System.out.println("fullName = " + fullName);
        System.out.println("age = " + age);
        System.out.println("gpa = " + gpa);
        System.out.println("universeName = " + universeName);

        input.close();





    }


}

