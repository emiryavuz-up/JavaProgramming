package aHomeTasks.aInterviewQuestions.tryOuts;

import java.util.ArrayList;
import java.util.Arrays;

public class MergingArrays {

    public static void main(String[] args) {

       String[] array1 = {"name1, name2, name3, name4"};
       String[] array2 = {"name5, name6, name7, name8"};

        ArrayList<String> arrayList = new ArrayList<>(array1.length + array2.length);

        arrayList.addAll(Arrays.asList(array1));

        arrayList.addAll(Arrays.asList(array2));

        System.out.println(arrayList);

        System.out.println("---------------------------------------");

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

        System.out.println("---------------------------------------");

        int[] num1 = {10, 20, 30, 40, 50};
        int[] num2 = {60, 70, 80, 90, 100};

        int[] total = new int[num1.length + num2.length];


        for (int i = 0; i < num1.length; i++) {
            total[i] = num1[i];
        }
        for (int k = 0; k < num2.length; k++) {
            total[num1.length + k] = num2[k];
        }


        System.out.println(Arrays.toString(total));

        System.out.println("-----------------------------------------");

        char[] ch1 = {'A', 'B', 'C', 'D'};
        char[] ch2 = {'E', 'F', 'G', 'H'};
        char[] chars = new char[ch1.length + ch2.length];
        
        j = 0;
        for (char each1 : ch1) {
            chars[j] = each1;
            j++;
        }
        for (char each2 : ch2) {
            chars[j] = each2;
            j++;
        }
        
        System.out.println(Arrays.toString(chars));

        System.out.println("-----------------------------------------");

        char[] totalCh = new char[ch1.length + ch2.length];

        for (int i = 0; i < ch1.length; i++) {
            totalCh[i] = ch1[i];
        }
        for (int l = 0; l < ch2.length; l++) {
            totalCh[ch1.length + l] = ch2[l];
        }

        System.out.println(Arrays.toString(totalCh));


    }

}
