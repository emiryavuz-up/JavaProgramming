package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ReverseSecondWordInterviewQ {


    public static void main(String[] args) {


        String sentence = "I Love Java";

        String[] words = sentence.split(" "); // {I, Love, Java]

        String reversedVersion = "";

        for (int i = words[1].length()-1; i >= 0 ; i--) {

           reversedVersion += words[1].charAt(i); // evoL
        }

        System.out.println(reversedVersion); // evoL

    //    sentence = sentence.replaceFirst(words[1], reversedVersion);

        words[1] = reversedVersion;

        System.out.println(Arrays.toString(words));

        String result = "";
        for (String word : words) {
            System.out.print(word + " ");
        }

        System.out.println(result);

        //words[1]  = elements of words 1's 2nd word


    }

}

/*
Write a program that can reverse the second word of the sentence
			Ex:
				sentence = "I Love Java";

			output:
				I evoL Java

 */