package day21_ForEachLoop;

import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {

        String str = "Java";
        char[] chars = str.toCharArray(); // every single character of str

        System.out.println(Arrays.toString(chars));

        for ( char each : chars ){ // every single character of str
            System.out.println(each);
        }

        System.out.println("--------------------------------");

        String sentence = "Simushy";

        System.out.println();

        // returns stringe array ==> sentence.split(" ");
        String[] words =  sentence.split(" ");

        System.out.println(Arrays.toString(words));

        // you can also choose to split @ character

        String email = "smyrna2017@gmail.com";

        String[] split = email.split("@"); // assigned to an array to be used below

        System.out.println(Arrays.toString(split));

        System.out.println("------------------------------------------------");

        String s = "Today is nice day. Today is Monday. Today we learn Java";

        String[] eachSentence = s.split("\\. "); // dot special = we need to use \\ before "."

        System.out.println(Arrays.toString(eachSentence));

    }

}
