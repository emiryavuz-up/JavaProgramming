package aHomeTasks.aInterviewQuestions;

public class AppearedTwice {

    // custom method of appearsTwice()
    public static boolean appearsTwice(String sentence, String target) {

        int count = 0;

        String wordAppearedTwice = "";

        for (String eachWord : sentence.split("")) {

            if(eachWord.equalsIgnoreCase(target)){
                count++;
            }
            if(count == 2) {
                wordAppearedTwice += eachWord;
                return true;
            }
        }

        System.out.println(wordAppearedTwice);

        return false;

    }

}
