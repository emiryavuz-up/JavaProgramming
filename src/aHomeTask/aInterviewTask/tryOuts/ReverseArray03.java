package aHomeTask.aInterviewTask.tryOuts;

import java.util.Arrays;

public class ReverseArray03 {

    public static void main(String[] args) {

        String[] words = {"karamel", "simushy", "limon", "maya"};

        String[] result = new String[words.length];

        for (int i = words.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = words[i];
        }

        System.out.println(Arrays.toString(result));



    }

}
