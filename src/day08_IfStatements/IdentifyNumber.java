package day08_IfStatements;

public class IdentifyNumber {

    public static void main(String[] args) {

    // number = 200

        int number = 200;

        boolean isPositiveNumber = number == 1;
        boolean isZero = number == 0;
        boolean isNegativeNumber = number == -1;

        boolean isP = number > 0;
        boolean isN = number < 0;
        boolean isZ = number == 0;

        System.out.println(number + " is positive number: " + isPositiveNumber);
        System.out.println(number + " is negative number: " + isNegativeNumber);
        System.out.println(number + " is Zero: " + isZero);

        System.out.println("isPositiveNumber = " + isPositiveNumber);
        System.out.println("isNegativeNumber = " + isNegativeNumber);
        System.out.println("isZero = " + isZero);




    }

}
