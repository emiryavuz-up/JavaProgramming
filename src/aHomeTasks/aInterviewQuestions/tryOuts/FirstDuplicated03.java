package aHomeTasks.aInterviewQuestions.tryOuts;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstDuplicated03 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,2,3,4,4,5,6,7,7,8,9,9));

        int firstDup = 0;

        for (Integer i : list) {

            int frequency = 0;

            for (Integer j : list) {

                if(i == j){
                    frequency++;
                }

            }

            if(frequency > 1){
                firstDup = i;
            }


        }

        System.out.println(firstDup);



    }

}
/*
list = [1,2,2,3,4,4,5,6,7,7,8,9,9];
output:
    9

 */