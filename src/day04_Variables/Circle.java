package day04_Variables;

   /*

     write a program that can calculate the area & perimeter of any given Circle

     pi, radius, diameter, area, perimeter

     hints: PI = 3.14
     area = radius * radius * pi
     perimeter = 2 * radius * pi

        */

public class Circle {


    public static void main(String[] args) {

        double PI = 3.14;
        double radius = 5.5;  // THIS CAN BE ANY NUMBER
        double diameter = radius * 2; // 10 * 2v = CALCULATES THE DIAMETER BY MULTIPLYING THE RADIUS TO 2
        double area = radius * radius * PI; // 10 * 10 * 3.14 = FINDS THE AREA OF THE CIRCLE
        double perimeter = 2 * radius * PI; // 10 * 2 * 3.14 = FINDS THE PERIMETER OF THE CIRCLE

        System.out.println("PI = " + PI);
        System.out.println("radius = " + radius);
        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);
        System.out.println("diameter = " + diameter);


    }

}


