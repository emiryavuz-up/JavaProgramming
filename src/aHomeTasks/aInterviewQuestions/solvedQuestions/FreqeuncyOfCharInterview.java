package aHomeTasks.aInterviewQuestions.solvedQuestions;

public class FreqeuncyOfCharInterview {

    public static void main(String[] args) {

        String str = "aaabccc";

        String result = ""; // a2b1c3d1


        for (int j = 0; j < str.length(); j++) { //a //a

            char ch = str.charAt(j); // 'a'

            int count = 0; // helps us to compare how many chars matching with the string

            for (int i = 0; i < str.length(); i++) { // finds the frequency of any character //a

                char each = str.charAt(i); // each character of string

                if(ch == each){
                    count++;
                }
            }

            if(result.contains(""+ch)){
                continue;
            }

            result += ch;
            result += count;

        }

        System.out.println(result);



    }

}

/*
Write a program that can find the frequency of the characters from a string

			 Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1
 */