package day15_ForLoop;

public class StringMethods {

    public static void main(String[] args) {

        // if you don't have any string / number is greater than 0

        String str = ""; // is empty

        boolean r = str.isEmpty(); // true

        System.out.println(r);


        boolean r1 = str.isBlank(); // does not contain anything other than white space
        // 20 spaces is not empty but blank. it does not have any char
        // only white space
        System.out.println(r1); // true


        String str2 = "CodeBastards        ";

        System.out.println(str2.isBlank());


        // // if you want to compare the word itself without any case sensitivity
        String s1 = "CodeBastards";
        String s2 = "CodeBastards";

        System.out.println(s1.equals(s2)); // is false

        // if you want to compare the word itself without any case sensitivity use below statement


        System.out.println(s1.equalsIgnoreCase(s2)); // true

        // Yes, YES, yEs, yES, YEs... compare user input with word "yes" without case sensitivity
        // equals will give you false because it compares


        //contains looks for the part of a string to check if it's involved or not

        String sentence = "My favorite programming language is Java";

        boolean hasCSharp = sentence.contains("C#"); // false
        boolean hasJava = sentence.contains("Java"); // true
        boolean hasJava2 = sentence.contains("java"); // false
        boolean hasJava3 = sentence.toLowerCase().contains("java"); // case sensitivity with contains since its STRING

        System.out.println(hasCSharp);
        System.out.println(hasJava);
        System.out.println(hasJava2);
        System.out.println(hasJava3);

        String input1 = "I love jAvA";
        String input2 = "Java";

        System.out.println(input1.equals(input2)); // false

        System.out.println(input2.equalsIgnoreCase(input1)); // false

        System.out.println(input1.contains(input2)); // false since there is "jAvA" in input1

        System.out.println(input1.toLowerCase().contains("java")); // true // case sensitivity
        System.out.println(input1.toUpperCase().contains("JAVA")); // true // case sensitivity

        String a = "Simushy";

        boolean x = a.startsWith("Si"); // advantageous because you can give more than 1 char at the same time

        boolean y = a.endsWith("mushy"); // if the string ends with "mushy"

        boolean z = a.toLowerCase().startsWith("Simushy"); // CASE SENSITIVITY
                              // TO HAVE CASE SENSITIVITY FIRST CREATE LOWERCASE OR UPPERCASE VERSION OF THE STRING
                                // and then compare it to other versions
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

    }
    }

