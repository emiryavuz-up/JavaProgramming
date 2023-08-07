package day15_ForLoop;

public class ReplaceBoth {

    public static void main(String[] args) {

        String str = "xcodeX";

       String firstLastChar = str.replace("x", "a").replace("X", "a");

        // right after first end paranthesis, add one "." and use replace again the same way to add 2nd char

        // ABOVE STATEMENT is ASSIGNED TO ANOTHER VARIABLE TO MAKE IT REUSABLE which is FirstLastChar

        // BOTH STATEMENTS RETURN STRING THAT'S WHY IT CAN BE USED TOGETHER IF THE VARIABLE TYPES ARE CHANGED
        // THEN YOU MAY NOT

        System.out.println(firstLastChar);


    }

}

/*
Write a program that asks user to enter a word. and replace all the x or X with character a
                    Input:
                        xcodeX
                    Output:
                        acodea

 */
