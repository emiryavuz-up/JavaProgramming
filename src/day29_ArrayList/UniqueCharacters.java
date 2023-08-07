package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacters {

    public static void main(String[] args) {

        String str = "aaabcccdeeef";

        // first convert String to non-primitive array
        // then convert to arrayList

        //  str.split(""); // we can get array that contains each character of this String
        // String[] arr = str.split("")
        // Arrays.asList(arr)

        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")) );

        System.out.println(list);

        String unique = "";

        for (String each : list) {
          int frequency = Collections.frequency(list, each);
          if(frequency == 1){
              unique += each;
          }

        }

        System.out.println(unique);

    }

}
