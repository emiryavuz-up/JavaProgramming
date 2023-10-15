package JavaRecap;

import java.util.Scanner;

public class day19_CirclePerimeterAndArea {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        int radius = scan.nextInt();

        while (radius < 0){
            System.out.println("Invalid radius, please re-enter the radius");
            radius = scan.nextInt();
        }

        double pi = 3.14;
        double diameter = radius * 2;
        double area = pi * radius * radius;
        double perimeter = 2 * pi * radius;

        System.out.println("Diameter of Circle: " + diameter + "\nArea of Circle: " + area + "\nPerimeter of Circle: " + perimeter);

    }

}
/*
Write a program that can calculate the area and perimeter of a circle:
			1. Ask the user "Enter the radius of the circle:"
				if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the radius of the circle"

			2. Display:
					1. Diameter of circle
					2. Area of circle
					3. Perimeter of circle

			3. Ask the user "Would you like to calculate another circle?"
					If "yes" --> repeat the previous steps
					If "No" --> Print "Thank you for using Cydeo Circle Calculator APP"

				If user enters an invalid entry, ask the user to re-enter until user provides a valid entry
 */
