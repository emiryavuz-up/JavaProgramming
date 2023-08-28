package aHomeTask.aInterviewTask.tryOuts;

import java.util.Arrays;

public class ReverseArray04 {

    public static void main(String[] args) {

        String[] list = {"ayla", "cido", "emir", "maya","smyrna"};

        String[] reversed = new String[list.length];

        for (int i = list.length - 1, j = 0; i >= 0; i--, j++) {

            reversed[j] = list[i];

        }

        System.out.println(Arrays.toString(reversed));
    }

}
