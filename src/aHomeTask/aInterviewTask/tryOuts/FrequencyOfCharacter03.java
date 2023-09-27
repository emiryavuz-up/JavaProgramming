package aHomeTask.aInterviewTask.tryOuts;

public class FrequencyOfCharacter03 {

    public static void main(String[] args) {

        String str = "aabcccd";
        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char first = str.charAt(i);

            int frequency = 0;

            for (int j = 0; j < str.length(); j++) {

                char second = str.charAt(j);

                if(first == second){
                    frequency++;
                }


            }

            if(result.contains("" + first)){
                continue;
            }

            result += first;
            result += frequency;

        }

        System.out.println(result);


    }

}

/*
/*
Write a program that can find the frequency of the characters from a string

			 Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1
 */
