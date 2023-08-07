package day14_String;

public class StringMethods03_Substring {

    public static void main(String[] args) {

        // substring() // to get a portion of the string substring is used.
        // first you provide the beginning index and ending index, it starts from beginning ends at ending

        String word = "Smyrna Koca Kafa"; // just get Smyrna as an example
        //             0123456789101112131415

        String brand = word.substring(0, 6); // it's not 5 because ending index is excluded by substring
        System.out.println(brand);

        String str1 = word.substring(7); // KOCA KAFA
        System.out.println(str1);

        String word2 = "Java Programming Language";

        String s1 = word2.substring(0, word2.indexOf(" ") ); // "Java"
        System.out.println(s1);

        String s2 = word2.substring(word2.indexOf(" ")+1,word2.lastIndexOf(" ") ); // "Programming" // character p with +1
        System.out.println(s2);

        String s3 = word2.substring(word2.lastIndexOf(" ")+1); // "Language"
        System.out.println(s3);


    }

}
