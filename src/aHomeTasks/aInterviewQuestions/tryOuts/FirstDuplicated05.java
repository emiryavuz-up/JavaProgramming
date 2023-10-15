package aHomeTasks.aInterviewQuestions.tryOuts;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstDuplicated05 {

    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,20,30,40,40,50,50,60,70,70));

        int firstDup = 0;

        for (Integer each1 : list) { // 10, 20

            int frequency = 0;

            for (Integer each2 : list) { // 10,20,30,40,40,50..

                if(each1.equals(each2)){
                    frequency++;
                }

            }

            if(frequency > 1){
                firstDup = each1;
                break;
            }

        }

        System.out.println(firstDup);


    }

}
