package aHomeTasks.aInterviewQuestions.tryOuts;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstDuplicated {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(10, 20, 30, 30, 40, 50, 50));

        int firstDuplicated = 0;

        for (Integer each : list) {

            int frequency = 0;

            for (Integer integer : list) {

                if(each == integer){
                    frequency++;
                }

            }

            if(frequency > 1){
                firstDuplicated = each;
                break;
            }


        }

        System.out.println(firstDuplicated);

    }

}
