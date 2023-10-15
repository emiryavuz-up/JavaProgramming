package aHomeTasks.aInterviewQuestions.tryOuts;

import java.util.Arrays;

public class ReverseArray02 {
    public static void main(String[] args) {

        String[] words = {"name1", "name2", "name3", "name4"};
        String[] reversed = new String[words.length];

        for (int i = words.length - 1, j = 0; i >= 0; i--, j++) {
            reversed[j] = words[i];
        }
        System.out.println(Arrays.toString(reversed));

        System.out.println("-----------------------------");

        

    }

}
