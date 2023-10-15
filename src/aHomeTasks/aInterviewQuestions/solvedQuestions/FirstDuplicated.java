package aHomeTasks.aInterviewQuestions.solvedQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstDuplicated {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll (Arrays.asList(1,2,2,3,4,4,5,6,7,8));

        int firstDup = 0;

        for (Integer each : list) {

            int frequency = 0;

            for (Integer element : list) {
                if(each == element){
                    frequency++;
                }
            }

            if(frequency > 1){
                firstDup = each;
                break;
            }
        }

        System.out.println(firstDup);

    }

}
