package aHomeTask.aInterviewTask.tryOuts;

public class FrequencyOfCharacter02 {

    public static void main(String[] args) {

        String str = "aabcccd";

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char ch1 = str.charAt(i);

            int frequency = 0;

            for (int j = 0; j < str.length(); j++) {

                char ch2 = str.charAt(j);

                if(ch1 == ch2) {
                    frequency++;
                }

            }

            if(result.contains("" + ch1)){
                continue;
            }


            result += ch1;
            result += frequency;
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

