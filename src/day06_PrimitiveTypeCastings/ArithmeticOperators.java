package day06_PrimitiveTypeCastings;

public class ArithmeticOperators {

    /*

    Topic: Operators
			Arithmetic Operators (%)        ------- Done
			Unary Operators (+, -, ++, --)  ------- Done

			Shorthand Operators (=, +=, -=, *=, /=, %=)
			Relational Operators (>, <, >=, <=, ==, !=)

     */

    public static void main(String[] args) {

        System.out.println(10 + 20);
        System.out.println(100 - 50);


        // double > float > long > int > short > byte // primitive types

        /*
        in math: 10/4 = 2.5
        in java: 2
         */

/*
integer / integer ====> integer
            decimal / integer ====> decimal
            integer / decimal ====> decimal
            decimal / decimal ====> decimal
 */


        System.out.println(100 / 3); // integer result. normally its 33.33333...
        System.out.println((double) 10 / 4); // 2 // you need to cast it to double to get the decimal result
        System.out.println(10 / 4.0); //
        System.out.println(10d / 4);
        System.out.println("==============================");
        int a = 100;
        double b = a / 6;  // 16.0
        System.out.println(b);


        double c = a / 6d;    //16.666666 // yanina "0" veya "d" ekliyoruz ki double yapalim ve decimal number gelsin
        System.out.println(c);

        // remainder = numerator - (denominator * result )

        // 10/3 = 3.333  // 10 - (3 * 3) = 1
        // 1/3 = 0.3333

        System.out.println(79 % 3);
    }

}
