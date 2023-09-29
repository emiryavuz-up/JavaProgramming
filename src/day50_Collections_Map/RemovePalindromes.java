package day50_Collections_Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class RemovePalindromes {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Java", "Python", "Car", "Level", "Civic", "Radar", "Kayak"));

        // we have to apply Iterable or use removeIf method otherwise eventually it will cause a bug

        Iterator<String> it = names.iterator();

        //while loop is used because it only requires one condition
        while(it.hasNext()){ // returns true long as there is an element that can be iterated

            String each = it.next(); // each element accessed by .next method and assigned to each variable

            String reversed = "";

            for(int i = each.length()-1; i >= 0; i--){
                reversed += each.charAt(i);
            }

            if(each.equalsIgnoreCase(reversed)){
                it.remove();
            }

        }

        System.out.println(names);

        System.out.println("---------------------------------");

        List<String> names2 = new ArrayList<>();
        names2.addAll(Arrays.asList("Java", "Python", "Car", "Level", "Civic", "Radar", "Kayak"));

        // remove elements that are palindrome

        Predicate<String> palindrome = str -> {
            String reverse = "";
            // multiple statements are needed therefore body is given in the str lambda expression
        for(int i = str.length()-1; i >= 0; i--){
            reverse += str.charAt(i);
        }
            return reverse.equalsIgnoreCase(str);
        };

        names2.removeIf(palindrome);

        System.out.println(names2);

        System.out.println("-------------------------");

        List<String> names3 = new ArrayList<>();
        names3.addAll(Arrays.asList("Java", "Python", "Car", "Level", "Civic", "Radar", "Kayak"));

        names3.removeIf(str -> {
            String reverse = "";
            // multiple statements are needed therefore body is given in the str lambda expression
            for(int i = str.length()-1; i >= 0; i--){
                reverse += str.charAt(i);
            }
            return reverse.equalsIgnoreCase(str);
        });


        System.out.println(names3);

    }


}
