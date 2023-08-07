package day21_ForEachLoop;

public class ForEachIntro {

    public static void main(String[] args) {

        //get each of the elements of numbers

        int[] numbers = {10, 20, 30, 40, 50, 60, 70};
        //               0,  1,  2,  3,  4,  5,  6

        for (int i = 0; i < numbers.length; i++) { // i: indexes of the array
            int eachElement = numbers[i]; // each of the indexes assigned to eachElement
            System.out.print(eachElement + " "); // eachElement is printed in the same line with a space between them
        }

        //faster and more efficient way is below

        for( int each : numbers ){ // EACH WILL START FROM NUMBERS
            System.out.println(each); // PRINTS ALL THE ELEMENTS OF NUMBERS FROM 0 TILL THE END
        }

    }


}
