package day28_ArrayList;

import java.util.ArrayList;

public class UniqueElements {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Java");   // 0 => first occurrence at index 0, last occurrence at index 2
        list.add("Java");   // 1 => first occurrence at index 0, last occurrence at index 2
        list.add("Java");   // 2 => first occurrence at index 0, last occurrence at index 2
        list.add("Python"); // 3 => first and last occurrence at index 3
        list.add("C#");     // 4 => first occurrence at index 4, last occurrence at index 6
        list.add("C#");     // 5 => first occurrence at index 4, last occurrence at index 6
        list.add("C#");     // 6 => first occurrence at index 4, last occurrence at index 6
        list.add("Ruby");   // 7 => first and last occurrence at index 7
        list.add("C++");    // 8 => first occurrence at index 8, last occurrence at index 9
        list.add("C++");    // 9 => first occurrence at index 8, last occurrence at index 9
        System.out.println(list);

        ArrayList<String> unique = new ArrayList<>();

        for (String each : list) {
            if(list.indexOf(each) == list.lastIndexOf(each)){
                unique.add(each);
            }
        }
        System.out.println(unique);




    }

}
