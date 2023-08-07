package day17_While_DoWhile;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String str = "AABBCC";
        String result = "";

        for (int i = 0; i < str.length(); i++) {

            String ch = "" + str.charAt(i); // "A", "A", "B", "B", "C", "C";

            // contains method is only used for string data type therefore "ch" is converted to string

            if(result.contains(ch)){ // if the result already contains the character
                continue; // this will skip that character and continue to the next one
                // break; // this will only give you "A" because it will exit right after it matches
            }

            result += ch; // this will add those characters to the result to be printed below
        }

        System.out.println(result);

    }

}
