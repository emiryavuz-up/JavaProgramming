package JavaRecap;

public class day04_Circle {

    public static void main(String[] args) {

        double PI = 3.14;
        double radius = 5.5;
        double diameter = radius * 2;
        double area = radius * radius * PI;
        double perimeter = 2 * radius * PI;

        System.out.println("PI: " + PI + "\nRadius: " + radius +"\nDiameter: " + diameter +
                "\nArea: " + area +"\nPerimeter: " + perimeter);




    }

}
/*
Create a class named Circle, write a program that can calculate the area & perimeter of any given Circle
			PI, radius, diameter, area, perimeter

					Hints: 	PI = 3.14
							area = radius * radius * PI
							Perimeter = 2 * radius * PI
 */