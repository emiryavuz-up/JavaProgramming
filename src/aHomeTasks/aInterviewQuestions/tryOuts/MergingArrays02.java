package aHomeTasks.aInterviewQuestions.tryOuts;

import java.util.Arrays;

public class MergingArrays02 {

    public static void main(String[] args) {

        String[] arr1 = {"name1", "name2", "name3", "name4", "name5"};
        String[] arr2 = {"name6", "name7", "name8", "name9", "name10"};

        String[] result = new String[arr1.length + arr2.length];

        int j = 0;
        for (String each1 : arr1) {
            result[j] = each1;
            j++;
        }

        for (String each2 : arr2) {
            result[j] = each2;
            j++;
        }

        System.out.println(Arrays.toString(result));
    }
}