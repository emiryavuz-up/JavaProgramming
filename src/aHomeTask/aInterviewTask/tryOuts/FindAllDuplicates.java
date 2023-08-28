package aHomeTask.aInterviewTask.tryOuts;

import java.util.ArrayList;
import java.util.Arrays;

public class FindAllDuplicates {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,2,3,4,4,5,6,7,7,8,9,9));

        ArrayList<Integer> duplicates = new ArrayList<>();

        for (Integer each1 : list) {

            int frequency = 0;

            for (Integer each2 : list) {

                if(each1.equals(each2)){ // 2 objects are being compared with equals method thanks to auto-boxing
                    frequency++;
                }

                if(frequency > 1 && !duplicates.contains(each1)){
                    duplicates.add(each1);
                }

            }
        }

        System.out.println(duplicates);



    }

}
