package aHomeTasks.aInterviewQuestions.tryOuts;

public class FrequencyOfCharacter {

    public static void main(String[] args) {

        String str = "aabcccd";

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char first = str.charAt(i);

            int count = 0;

            for (int j = 0; j < str.length(); j++) {

            char second = str.charAt(j);

            if(first == second){
                count++;
            }

            }

            if(result.contains("" + first)){
                continue;
            }

            result += first;
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