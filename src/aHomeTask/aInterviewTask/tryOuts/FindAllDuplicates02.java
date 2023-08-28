package aHomeTask.aInterviewTask.tryOuts;

import java.util.ArrayList;
import java.util.Arrays;

public class FindAllDuplicates02 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,20,30,30,40,50,60,60,70,80,80));


        ArrayList<Integer> duplicates = new ArrayList<>();

        for (Integer each1 : list) {
            int frequency = 0;

            for (Integer each2 : list) {

                if(each1.equals(each2)){
                    frequency++;
                }

            }

            if(frequency > 1 && !(duplicates.contains(each1))){
                duplicates.add(each1);
            }
        }

        System.out.println(duplicates);


    }

}
