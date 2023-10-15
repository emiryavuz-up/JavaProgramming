package JavaRecap;

import java.util.Arrays;

public class day22_ReverseSecondWord {

    public static void main(String[] args) {


    String sentence = "I Love Java";

    String[] words = sentence.split(" ");

    String reversedVersion = "";

        for (int i = words[1].length()-1; i >= 0; i--) {

            reversedVersion += words[1].charAt(i);
        }

        words[1] = reversedVersion;


        for (String eachWord : words) {
            System.out.print(eachWord + " ");
        }



}

}

/*
Write a program that can reverse the second word of the sentence
			Ex:
				sentence = "I Love Java";

			output:
				I evoL Java

 */
