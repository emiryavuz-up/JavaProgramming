package aHomeTask.aInterviewTask.tryOuts;

import java.util.Arrays;

public class MergingArrays03 {

    public static void main(String[] args) {

        String[] list1 = {"name1", "name2", "name3"};
        String[] list2 = {"name4", "name5", "name6"};

        String[] result = new String[list1.length + list2.length];

        int j = 0;
        for (String each1 : list1) {
            result[j] = each1;
            j++;
        }
        for (String each2 : list2) {
            result[j] = each2;
            j++;
        }

        System.out.println(Arrays.toString(result));

    }

}
