package day22_MultiDimensionalArray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseSentences {

    public static void main(String[] args) {

        String sentence = "Today is a good day to learn Java";

        String words[] = sentence.split(" "); // to get each of the words one by one to make reversing easier ==> starting from last index of this array to the first index

        System.out.println(Arrays.toString(words));


        String reversedSentence = ""; // Java learn to day good a is Today

        for (int i = words.length -1 ; i >= 0; i--) {
            reversedSentence += words[i] + " ";
        }

        System.out.println(reversedSentence);
    }
}
