package day13_String;

import java.lang.String; //MANDATORY TO IMPORT

public class StringIntro {

    public static void main(String[] args) {

       // Scanner scan; // this scanner is from outside of this package so needs to be imported.


        String name = "Simushy";
        String name2 = "Simushy";
        String name3 = "Simushy";
        String name4 = "Simushy";

        System.out.println(name == name2); // true
        System.out.println(name == name2); // true
        System.out.println(name == name2); // true

        System.out.println("----------------------------");


     String s1 = "Java";
     String s2 = new String("Java"); // THIS CREATES ANOTHER JAVA UNLIKE OTHER EXAMPLES
        String s3 = new String("java"); //new creates another object in the pool

        System.out.println( s2 == s3); // FALSE

        System.out.println(s1.equals(s2)); // COMPARING VALUE OF TWO OBJECTS // for string objects only




    }


}
