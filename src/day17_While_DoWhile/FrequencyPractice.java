package day17_While_DoWhile;

public class FrequencyPractice {

    public static void main(String[] args) {

        String str = "ASDASBDABAGEQGEQGASDADSAAZXVCVBNDJHFKJGAaAAAAAAAAAAAAAAAAAAA";

        char ch = 'A';

        int frequency = 0; // +1+1 increasing the frequency by one when same character matched

        for (int i = 0; i < str.length(); i++) { // i: indexes of str
            char eachChar = str.charAt(i); // eachChar: each character of str

            if(ch == eachChar){ // if given ch is matching with the eachChar, then ch is appeared in the string
               frequency++; // if the given ch is matching with the eachChar, increment the value by one

            }


        }
        System.out.println(frequency);

    }

}
/*
	1. Write a program that can return the frequency of a char from a String

			Ex:
				str = "AAABBBC"
				ch = 'A'

			Output:
				3
 */