package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {

    public static void main(String[] args) {



        //create a variable that is capable enough to contain 5 names
        // hints: you just know the total number of the names, you don't know who they are, their names
        // size is fixed, so you need to set the size when declaring an array = new String [5] = 5
        // supports both primitive and non primitives, int and String
        // min number is 0, you can't give -1 to array = size is fixed

        String[] myGroup = new String[5]; // this array variable needs to contain 5 strings to cover 5 names
        //                       // 0 ~ 4

        myGroup[0] = "Maya"; // maya can be given again at number 2,3,4,5... it will be updated each time tho you may get one null
        myGroup[1] = "Smyrna";
        myGroup[2] = "Jager";
        myGroup[3] = "TomTom";
        myGroup[4] = "Limon";
        //one more would give you indexOutOfBoundsException error. because max number is 5 ~ 0,1,2,3,4,5;

        // myGroup array variable can have 5 string data // cant be changed or removed.
        // to string error
        //output of myGroup is: [null, null, null, null, null] when you don't give anything

        int[] myNumber = new int[5]; // default value is [0, 0, 0, 0, 0]
        //  System.out.println(myGroup); will give you hash code, wrong way
        // default value of all non-primitives = null = no object
        // default value is assigned whenever no other values are being assigned to the variable
        // default value for primitives ==> null
        // default value for byte,short,int,long ==> 0
        // default value for float, double ==> 0.0
        // booelean ==> false


        System.out.println(Arrays.toString(myGroup));

        System.out.println();

        System.out.println(Arrays.toString(myNumber));


        System.out.println("------------------------------------------------------");

        // names of the week
        // we know the exact number and the name of the week
        // therefore we can use Array

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"}; // size is already assigned
        //index numbers     0          1           2            3          4          5          6

        System.out.println( Arrays.toString(days) ); // to string!!!!!

        int number = 5;

        if(number < 1 || number > 7){
            System.err.println("Invalid Number");
            System.exit(0);
        }


        System.out.println(days[number-1]); // this prints the specific data given to int variable above.

    }

}
