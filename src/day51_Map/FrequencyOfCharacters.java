package day51_Map;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "bbcccaaaaa";
        //              b c a
        // No need to remove duplicates because of Map
        // letter is the key, frequency is the value
        // convert the Array to a Collection type by using split() method which allows you to convert String to an Array
        // Frequency method accepts one object and one Collection then returns the count of its occurrences in a given collection in Java
        String[] arr = str.split("");

        Map<String, Integer> result = new LinkedHashMap<>();

        for (String eachKey : arr) { // each: characters of String
            // int frequency = Collections.frequency(Arrays.asList(arr), eachKey);
            // result.put(eachKey, frequency);
            result.put(eachKey, Collections.frequency(Arrays.asList(arr), eachKey));

        }

        System.out.println(result);




    }

}

/*
    Write a program that can return the frequency of characters
        Note : MUST use Map

        Ex: str= "bbcccaaaaa"

        output:
            {b=2, c=3, a=5}
 */