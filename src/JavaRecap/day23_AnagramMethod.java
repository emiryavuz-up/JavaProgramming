package JavaRecap;

import java.util.Arrays;

public class day23_AnagramMethod {

    public static void main(String[] args) {

        isAnagram("acdb", "dbca");

    }
    public static boolean isAnagram(String str1, String str2){

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean r1 = Arrays.equals(ch1, ch2);
        System.out.println(r1);
        return r1;


    }

}
