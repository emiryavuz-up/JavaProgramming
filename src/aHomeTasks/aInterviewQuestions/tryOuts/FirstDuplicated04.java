package aHomeTasks.aInterviewQuestions.tryOuts;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstDuplicated04 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,2,3,4,4,5,6,7,7,8,9,9));

        int firstDup = 0; // created a variable with default value to be updated later on as firstDup character

        for (Integer each1 : list) {

            int frequency = 0; // when compared with rest of the elements, we need to also count the frequency // so this variable with default value is created to be updated later on when characters match

            for (Integer each2 : list) {

                if(each1.equals(each2)){ // when an object is being compared, we should always use equals method instead of "=="

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

/*
list = [1,2,2,3,4,4,5,6,7,7,8,9,9];
output:
    9
*/
