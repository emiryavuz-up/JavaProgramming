package day18_NestedLoop;

public class DivideTwoNumbers {

    public static void main(String[] args) {

        int a = 30;
        int b = 7;

        int count = 0; // increment of count to be used below with ++ or other operators

        while(a >= b){ // as long as "a" has value to be substracted from "b" which means it should be bigger
            a -= b; // substract "b" from a and update the "a", 30-7 = 23 ==> 23-7 = 16...
            count++; // counting how many times that we contracted the above statement
        }

        System.out.println(count + " with a remainder of " + a); // represents the remainder as it is the last number left after substracting

    }

}

/*
  1.  Write a program that can divide two positive numbers
    without using / (division) and * (multiplication) and % operators

                        20 / 6 ==> 3 with the remainder of 2


                        a = 20
                        b = 6;


                        a -= b;  // a = 14
                        a -= b;  // a = 8
                        a -= b;  // a = 2


                        x = 100;
                        y = 8;

                        while(a >= b){
                                a -= b;
                                count++;
                        }
 */