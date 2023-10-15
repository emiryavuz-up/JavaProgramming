package aHomeTasks.day26;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        System.out.println(areAnagram("Listen", "Silent"));
        System.out.println(areAnagram("Hello", "World"));
        System.out.println(areAnagram("Conversation", "Voices rant on"));

    }

    public static boolean areAnagram(String str1, String str2) {

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        char[] first = str1.toCharArray();
        char[] second = str2.toCharArray();

        Arrays.sort(first);
        Arrays.sort(second);

        for (char each : first) {
            if (Character.isWhitespace(each)) {
                continue;
            }
        }
            for (char each2 : second) {
                if (Character.isWhitespace(each2)) {
                    continue;
                }
            }

            boolean isAnagram = Arrays.equals(first, second);

            return isAnagram;

        }



    }



