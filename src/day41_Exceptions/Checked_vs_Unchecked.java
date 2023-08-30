package day41_Exceptions;

import day39_Recap.personTask.Person;

import java.io.FileInputStream;

public class Checked_vs_Unchecked {

    public static void main(String[] args) {

        // unchecked exception:

        int a = 10;
        int b = 0;

      //   System.out.println( a / b ); // this unchecked exception will crush the program

     //   System.out.println("Code Bastards");

        char[] characters = {'A', 'B', 'C'};

     //   System.out.println(characters[99]); // compiler is not able to check this exception
                                            // therefore it is unchecked exception

        Person person = null; // null does not reference to any object // object does not exist
                                // if the object does not exist, person object is not created

      //  System.out.println(person.getName()); // without object, it's not possible to use the instance // so it's an unchecked exception

      //  person.sleep();

        String str = "Code Bastards"; // once you use "final" keyword ==> it won't be eligible for Garbage Collector

        str = null; // Code Bastards will be deleted by the Garbage Collector because we assign null to str

        // str.toCharArray(); ==> unchecked exception

        String str2 = ""; // still exists in the java heap

        System.out.println(str2.isEmpty());

        // checked Exception: Requires immediate attention otherwise you won't be able to run your code

        System.out.println("Hello");
        // to make it sleep for 3 second

        // Thread.sleep(3000); // 3 seconds

        System.out.println("Girls");

        // FileInputStream file = new FileInputStream("path of the file");

    }

}
