package aHomeTasks.day09;

public class Identity03 {

    public static void main(String[] args) {

        /*
        write a program that can identify if the given character is a digit or Alphabetic Character(A~Z or a~Z) or a special character

		Ex:
			ch = '@'

		output:
			Special Character
         */


        char input = '@';
        String name = "a";

        if (input >= 0 && input <= 0) {
            name = "Number";
        } else if (input >= 'A' && input <= 'Z') {
            name = "Alphabetic Character";
        } else {
            name = "Special Character";
        }
        System.out.println(name);

    }
}