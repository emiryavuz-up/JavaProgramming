package day09_IfStatements;

public class Identity {

    public static void main(String[] args) {


        /*
        Character Identity, and write a program that can identify if the given character is a digit or Alphabetic Character(A~Z or a~Z) or a special character

		Ex:
			ch = '@'

		output:
			Special Character

		HINT: You may wanna check out the numbers of the characters on ASCII table
         */

        char a = 33;
        char b = 100;
        char c = 'c';

        if (c >= 'A' && c <= 'Z') {
            System.out.println(c + " = Alphabetical Character");
        } else if (c >= 'a' && c <= 'z') {
            System.out.println("Alphabetical Character");
        } else if (a >= 0 && a <= 127){;
            System.out.println(a + " = Special Character");
        } else if (b >= 0){
            System.out.println(" = Number");
        } else{
            System.out.println("Invalid");
        }
        System.out.println("c = " + c);

    }
}

