package day20_Arrays;

import java.util.Arrays;

public class Alphabet {

    public static void main(String[] args) {

        // 26 characters at each index


        // in case you don't know the characters but that there are 26 characters
        char[] alphabet = new char[26]; // store the characters from z to a
               //i   //ch
        alphabet[0] = 'Z'; // 90 = ascii table
        alphabet[1] = 'Y'; // 89 = ascii table
        alphabet[2] = 'X'; // 88 = ascii table

        System.out.println(Arrays.toString(alphabet)); // prints the entire array

        System.out.println(alphabet[0]); // prints element of array

        System.out.println("----------------------------------------");

        char ch = 'Z';

        for (int i = 0; i < alphabet.length; i++, ch--){
            alphabet[i] = ch;
        }


        /*
        for (char i = 0, j = 'Z'; i < alphabet.length; i++, i--){
            alphabet[i] = j;
        }
        */





    }

}
