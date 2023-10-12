package day53_FunctionalInterface;

import java.util.*;

public class MapPractice {

    public static void main(String[] args) {


        Map<String, Double> unit1 = new LinkedHashMap<>();
        unit1.put("OOP Encapsulation", 14.5);
        unit1.put("OOP Inheritance", 5.5);
        unit1.put("Final Keyword", 2.5);
        unit1.put("Exceptions", 3.5);

        Map<String, Double> unit2 = new LinkedHashMap<>();
        unit2.put("Statics", 6.5);
        unit2.put("ArrayList", 8.5);
        unit2.put("Wrapper Classes", 4.5);
        unit2.put("Method Overriding", 9.5);
        Map<String, Double> unit3 = new LinkedHashMap<>();
        unit3.put("Custom Class", 10.5);
        unit3.put("Garbage Collection", 9.5);
        unit3.put("Custom Methods", 8.5);
        unit3.put("Map", 7.5);
        Map<String, Double> unit4 = new LinkedHashMap<>();
        unit4.put("OOP Astraction", 14.5);
        unit4.put("OOP Polymporhism", 5.5);
        unit4.put("Collection", 30.5);
        unit4.put("Map", 20.5);

        List<Map<String, Double>> allUnits = new ArrayList<>();
        allUnits.addAll(Arrays.asList(unit1, unit2, unit3, unit4));

        for (Map<String, Double> eachUnit : allUnits) {

            for (Map.Entry<String, Double> entry : eachUnit.entrySet()) {
                    if(entry.getValue() >= 7){
                        System.out.println(entry.getKey());
                    }

                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }

        // Display the names of java tpoics that we spend less than 3 hours
        for (Map<String, Double> eachUnit : allUnits) {

            for (Map.Entry<String, Double> entry : eachUnit.entrySet()) {
                if(entry.getValue() < 3){
                    System.out.println(entry.getKey());
                }

                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }

        // Which topic has the minimum hours

        double max = Double.MIN_VALUE;
        String name1 = "";

        for (Map<String, Double> eachUnit : allUnits) {

            for (Map.Entry<String, Double> entry : eachUnit.entrySet()) {

                if(entry.getValue() > max ){
                    max = entry.getValue();
                    name1 = entry.getKey();
                }
            }
        }
        System.out.println(max);
        System.out.println(name1);

        System.out.println("----------------");

        double min = Double.MAX_VALUE;
        String name2 = "";

        for (Map<String, Double> eachUnit : allUnits) {

            for (Map.Entry<String, Double> entry : eachUnit.entrySet()) {

                if(entry.getValue() < min ){
                    min = entry.getValue();
                    name2 = entry.getKey();
                }
            }
        }
        System.out.println(min);
        System.out.println(name2);


    }
}
