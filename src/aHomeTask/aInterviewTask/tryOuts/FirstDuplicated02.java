package aHomeTask.aInterviewTask.tryOuts;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstDuplicated02 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,2,3,4,4,5,6,7,7));

        int firstDup = 0;

        for (Integer each1 : list) {

            int frequency = 0;

            for (Integer each2 : list) {

                if(each1 == each2){
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
Write a program that can return the first duplicated element from an arrayList of Integer
		Ex:
			list = [1,2,2,3,4,4,5,6,7,7];
			output:
				2
 */