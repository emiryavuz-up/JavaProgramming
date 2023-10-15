package aHomeTasks.aInterviewQuestions.tryOuts;

public class FrequencyOfCharacter04 {

    public static void main(String[] args) {

        String str = "aabbcccdd";
        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char firstCh = str.charAt(i);

            int count = 0;

            for (int j = 0; j < str.length(); j++) {

                char secondCh = str.charAt(j);

                if(firstCh == secondCh){

                    count++;

                }

            }

            if(result.contains("" + firstCh)){
                continue;
            }

            result += firstCh;
            result += count;


        }

        System.out.println(result);

    }

}
