package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice01 {

    public static void main(String[] args) {

        String[] countries = {"Japan", "Korea", "United States", "Turkey", "United Kingdom", "Canada"};

        // converting array to arrayList

        ArrayList<String> list = new ArrayList<>(Arrays.asList(countries));

        list.removeIf( p -> p.length() >= 10);

        // converting arrayList to array

        countries = list.toArray(new String[0]); // zero will be replaced by the size of this list countries

        System.out.println(Arrays.toString(countries));

    }

}
