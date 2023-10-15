package JavaRecap;

import java.util.Arrays;

public class day25_MergeArrayMethod {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};

        mergeArrays(arr1,arr2);

    }

    public static int[] mergeArrays(int[] arr1, int[] arr2){

        int[] mergedArrays = new int[arr1.length + arr2.length];

        int j = 0;
        for (int i = 0; i < arr1.length; i++){
            mergedArrays[j++] = arr1[0]++;
        }
        for (int k = 0; k < arr2.length; k++) {
            mergedArrays[j++] = arr2[0]++;
        }

        System.out.println(Arrays.toString(mergedArrays));

        return mergedArrays;
    }

}
