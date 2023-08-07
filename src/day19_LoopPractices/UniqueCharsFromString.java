package day19_LoopPractices;

public class UniqueCharsFromString {

    public static void main(String[] args) {

        String str = "aabccdeef";

        String result = ""; // bdf // variable is created to store unique characters that will be found


        for (int j = 0; j < str.length(); j++) { // outer loop // aabccdeef

            char ch = str.charAt(j); // a, a, b

            int count = 0; // frequency of the variable created here to be counted below
            // everytime ch matches each, we will increase count by one

            for (int i = 0; i < str.length(); i++) { // compares the character that outer loop picked, with each character of string.. run the below statement for the length of str and
                char each = str.charAt(i); // find each character a,a,b,c,c,d,e,e,f 3x
                if(ch == each){ // if ch equals each
                    count++; // increase the count value by 1
                }

            }

            if(count == 1){ // if the frequency of the character is 1, then the character is unique.
                result += ch;
            }

        }

        System.out.println(result);
    }



}

/*
Write a program that can find the unique characters from a string without using indexOf() and lastIndexOf() methods

    			Ex:
                        str = "aabccdeef";

                        output:
                                bdf
 */