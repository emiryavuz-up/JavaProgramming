package day29_ArrayList;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethod {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));


        /*
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) % 2 != 0){
                list.remove(i);
            }

        }
*/
        System.out.println(list);

        // internally uses iterable, also loop. array list will be iterated and it will remove elements matching with below condition
        list.removeIf( p -> p < 5); // p is all the elements // p < 5 because ?? // lambda expression

        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        list2.removeIf( each -> each  % 2 == 0 ); // variable name lambda expression boolean expression // implicitly uses for loop
        System.out.println(list2);

        System.out.println("------------------------------------------------");

        ArrayList<String> list3 = new ArrayList<>();

        list3.addAll(Arrays.asList("Java", "Python", "JavaScript", "C#", "C++", "Java", "Java"));

        // remove all the elements starts with j
        // we can use remove if method to be more efficient

        list3.removeIf( p -> p.startsWith("J") ); // iterates through each character and checks each if they start with "J" if so removes it

        System.out.println(list3);

                // functional interface
                // lambda expression

        System.out.println("----------------------------------------------------");

        ArrayList<String> names = new ArrayList<>();

        names.addAll(Arrays.asList("Anna", "Racecar", "Level", "Eye", "Python", "Smyrna"));

        // remove all palindromes from ArrayList

        // for not palindrome = unique one's just add "!" before StringUtility

        names.removeIf( name -> StringUtility.isPalindrome(name)); // arrow token represents lambda expression

        System.out.println(names);

    }

}
