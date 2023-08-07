package aHomeTask.day09;

public class Identity02 {

    public static void main(String[] args) {


        /*
        4. Create a class called Character Identity, and write a program that can identify if the given character is
        a digit or Alphabetic Character(A~Z or a~Z) or a special character

		Ex:
			ch = '@'

		output:
			Special Character

		HINT: You may wanna check out the numbers of the characters on ASCII table
         */


        char a = '5';
        char b = 'b';
        char c = '@';

        if (a >= 'A' && a <= 'Z') {
            System.out.println("Alphabetic Character xD");
        } else if (a >= 'z' && a <= 'z') {
            System.out.println("Alphabetic Characters A~Z");
        } else if (b >= 0 && b <= 0){
            System.out.println("Number xD");
        } else if (c >= 0 && c <= 127){
            System.out.println("Special Character@@@@@@");
        }else {
            System.out.println("Invalid");
        }
        System.out.println("c = " + c);
        System.out.println("b = " + b);
        System.out.println("a = " + a);




    }

}