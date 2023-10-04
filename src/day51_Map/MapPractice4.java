package day51_Map;

import java.util.*;

public class MapPractice4 {

    public static void main(String[] args) {


        ArrayList<String> group1 = new ArrayList<>(Arrays.asList("Duygu", "Magda", "Farangez", "Edison"));
        ArrayList<String> group2 = new ArrayList<>(Arrays.asList("Margie", "Vesele", "Iryn", "Nilufar", "Aziza", "Nurcan", "Raika", "Igor", "Elif", "Sana", "Azamat"));
        ArrayList<String> group9 = new ArrayList<>(Arrays.asList("Alex", "Ali", "Andriy", "Cassandra", "Sevgul", "Olha", "Tito", "Ozan", "Serkan", "Furkan", "Madina", "Muharrem"));
        ArrayList<String> group24 = new ArrayList<>(Arrays.asList("Maria", "Kristina", "Amin", "George", "Layan", "Amin", "Amin", "Yulia", "Georger", "Ayanle", "Maxim", "Nermin", "Dough"));
        ArrayList<String> group5 = new ArrayList<>(Arrays.asList("Nazar", "Veronika", "Mikael", "Layla", "Badmaa", "Zaeir", "Anna", "Tamara", "Eugene"));

        /*
        String[] group1 = {"A", "B", "C", "D"};
        String[] group2 = {"Margie", "Vesele", "Iryn", "Nilufar", "Aziza", "Nurcan", "Raika", "Igor", "Elif", "Sana", "Azamat"};
        String[] group3 = {"Alex", "Ali", "Andriy", "Cassandra", "Sevgul", "Olha", "Tito", "Ozan", "Serkan", "Furkan", "Madina", "Muharrem"};
        String[] group4 = {"Maria", "Kristina", "Amin", "George", "Layan", "Amin", "Amin", "Yulia", "Georger", "Ayanle", "Maxim", "Nermin", "Dough"};
        String[] group5 = {"Nazar", "Veronika", "Mikael", "Layla", "Badmaa", "Zaeir", "Anna", "Tamara", "Eugene"};

        // pair: ID & Names Of Students
        // TreeMap sorts the keys in ascending order
        Map<Integer, String[]> groups = new LinkedHashMap<>();
        groups.put(1, group1);

        System.out.println(Arrays.toString(groups.get(1)));
*/
        // key can be any type and so is the value
        // when you make the value arraylist it means it key represents an arrayList
        // key is Integer, value type is ArrayList
        Map<Integer, ArrayList<String>> groups = new TreeMap<>();
        groups.put(1, group1); // group id and the names of the students is given
        groups.put(2, group2); // group id and the names of the students is given
        groups.put(9, group9); // groups with the id of 24 and arrayList that contains the name of the students name is group5
        groups.put(24, group24); // group id and the names of the students is given
        groups.put(5, group5); // group id and the names of the students is given

        System.out.println(groups);

        // display the names of the students from group3 in separate lines

        for (String eachElement : groups.get(9)) {
            System.out.println(eachElement);
        }

        // name of the first person in the group2
        // groups.get(2) --> returns ArrayList --> value of the given key
        System.out.println(groups.get(2).get(1));

        // method chaining
       // System.out.println(groups.get(2).get(1).charAt(5));

        System.out.println("---------------------------------------");

        // print all the names in the groups
        for (ArrayList<String> eachGroup : groups.values()) {
            for (String eachName : eachGroup) {

                System.out.println(eachName);

            }
        }


    }

}
