package day52_FunctionalInterface;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class ArrayOfMap {

    public static void main(String[] args) {

        // Has disadvantages when compared with Collection --> size isn't fixed, accessing is easier
        // multiple Maps can be best handled by using List Of Map, lots of useful methods will be available and size will be dynamic

        // MAP --> COLLECTION OF PAIRS
        Map<String, String> scrumTeam1 = new LinkedHashMap<>();
        scrumTeam1.put("Aksel", "Developer");
        scrumTeam1.put("Smyrna", "Developer");
        scrumTeam1.put("Limon", "Developer");
        scrumTeam1.put("Naya", "Developer");
        scrumTeam1.put("Simushy", "Developer");
        scrumTeam1.put("KocaKafa", "Developer");

        Map<String, String> scrumTeam2 = new LinkedHashMap<>();
        scrumTeam2.put("Aksel", "SDET");
        scrumTeam2.put("Smyrna", "PO");
        scrumTeam2.put("Limon", "MO");
        scrumTeam2.put("Naya", "DEVELOPER");
        scrumTeam2.put("Simushy", "CEO");
        scrumTeam2.put("KocaKafa", "CFO");

        Map<String, String> scrumTeam3 = new LinkedHashMap<>();
        scrumTeam3.put("Aksel", "Developer");
        scrumTeam3.put("Smyrna", "Developer");
        scrumTeam3.put("Limon", "Developer");
        scrumTeam3.put("Naya", "Developer");
        scrumTeam3.put("Simushy", "Developer");
        scrumTeam3.put("KocaKafa", "Developer");

        Map<String, String> scrumTeam4 = new LinkedHashMap<>();
        scrumTeam4.put("Aksel", "Scrum Master");
        scrumTeam4.put("Smyrna", "SO");
        scrumTeam4.put("Limon", "PO");
        scrumTeam4.put("Naya", "Developer");
        scrumTeam4.put("Simushy", "QA");
        scrumTeam4.put("KocaKafa", "SDET");

        Map<String, String> scrumTeam5 = new LinkedHashMap<>();
        scrumTeam5.put("Aksel", "Functional Tester");
        scrumTeam5.put("Smyrna", "Senior Tester");
        scrumTeam5.put("Limon", "Developer");
        scrumTeam5.put("Naya", "Developer");
        scrumTeam5.put("Simushy", "Developer");
        scrumTeam5.put("KocaKafa", "Developer");

        Map<String, String>[] array = new Map[5];
        array[0] = scrumTeam1;
        array[1] = scrumTeam2;
        array[2] = scrumTeam3;
        array[3] = scrumTeam4;
        array[4] = scrumTeam5;

        System.out.println(Arrays.toString(array));

    }
}
