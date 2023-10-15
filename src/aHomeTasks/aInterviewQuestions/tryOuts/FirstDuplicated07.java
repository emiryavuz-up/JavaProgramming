package aHomeTasks.aInterviewQuestions.tryOuts;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstDuplicated07 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,20,30,40,40,50,60,70,70,80,80,90));

        int firstDuplicated = 0;

        for (Integer each1 : list) {

            int frequency = 0;

            for (Integer each2 : list) {

                if(each1.equals(each2)){
                    frequency++;
                }

            }

            if(frequency > 1){
                firstDuplicated = each1;
                break;
            }


        }
        System.out.println(firstDuplicated);

    }

}
