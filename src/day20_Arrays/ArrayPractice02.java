package day20_Arrays;

import java.util.Arrays;

public class ArrayPractice02 {

    public static void main(String[] args) {

        //alphabet

        char[] letters = new char[26]; // can contain 26 char elements
       /*
        letters[0] = 'A';
        letters[1] = 'B';
        letters[2] = 'C';
        ...
        */


      char ch = 'A';

        for (int i = 0; i < letters.length; i++) { // i++, ch++ can be also given here
            letters[i] = ch++; // ch++ increases the value in the second step
        }

        /*
        for(char i = 0, j = 'A'; i <= 'Z' && j < letters.length; i++, j++){

            letters[j] = i;

        }
         */

        System.out.println(Arrays.toString(letters)); // {A~Z}

        System.out.println("------------------------------------------------");

        char[] letters2 = new char[26]; // [Z~A]



    }

}
