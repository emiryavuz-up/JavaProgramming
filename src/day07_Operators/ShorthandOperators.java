package day07_Operators;

public class ShorthandOperators {

    public static void main(String[] args) {

        //assignment: = assignment
        int number = 100;

        System.out.println("number = " + number); //till page 10 you need it as 100 but then
        // to change you just assign a new value

        number = 200; // if you give it another int name can not be duplicated!!!!!!!

        System.out.println("number = " + number); // 200 because last given number is 200

        String word = "Java Programming";
        System.out.println("word = " + word); // prints Java Programming
        // at line 17 you assigned it Java Programming

        // lets say after line 17 you need to change it. you can just reuse it
        // instead of creating another one

        word = "Simushy";
        System.out.println("word = " + word); // therefore Simushy will be printed!! line 24!!

        // if you dont need Simushy anymore just type word and then assign something else

        word = "Smyrna";
        System.out.println("word = " + word); // therefore is Smyrna

        // data type is super important you cant write smyrna with int.... its the ultimate decision
// if the data type is int you can only assign integers.

        short sayi = 10;

        sayi = (short) 3123123;
        // output depends on when did you last changed it!!
        //

        System.out.println("sayi = " + sayi);

        // addition assignment:
        int x = 100;
        System.out.println("x = " + x); // 100
        System.out.println(x + 200); // 300
        System.out.println("x = " + x);

        x = x + 200;
        System.out.println("x = " + x);

        x += 100;
        System.out.println("x = " + x);

        String str = "Simushy";
        str += "Smyrna";
        System.out.println("str = " + str); // ONLY PLUS CAN BE ADDED TO A STRING

        // prints Simushy

        double num1 = 2.5;

        System.out.println("num1 = " + num1); // 2.5

        System.out.println("num1 = " + num1); // 8.0

        num1 += 5.5;
        System.out.println("num1 = " + num1); // 8.0!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!


        double availableBalance = 1000.5;
        // deposit 300$

        availableBalance += 300; // availableBalance = 1000.50 + 300 =
        System.out.println("availableBalance = " + availableBalance); //1300.5


        System.out.println("-----------------------------------");

        // withdrawing 500$

        availableBalance -= 500; // availableBalance = 1300.5  500;
        System.out.println("availableBalance = " + availableBalance);

        // withdraw 200$ first and then deposit $400;

        availableBalance -= 200; // 800.5
        availableBalance += 400; // 1000.5

        System.out.println("availableBalance = " + availableBalance);

        double salary = 50000.50;
        System.out.println("salary = " + salary); //
        salary *= 2; // salary is multiplied by 2 times and got assigned back to the variable.
        System.out.println("salary = " + salary);

        double doge = 0.00000001;
        doge *= 1000000000;


        double num3 = 100;

        // %=

        num3 %= 3;

        System.out.println("num3 = " + num3);


        int amount = 127; // cents
        //  how many quarters and cents do you need to return 127 cents

        int quarters = 127 / 25;
        int cents = 127 % 25;

        System.out.println("cents = " + cents);
        System.out.println("quarters = " + quarters);

        int cents2 = 127;

        cents2 %= 25;

        System.out.println("cents2 = " + cents2);

        int y = 300;

        y %= 16; // remainder gives what the leftover is and = gives it back to the y.

        System.out.println("y = " + y);

        // insurance fee

        int balance = 3500;

        balance %= 153;
        System.out.println("balance = " + balance); // if i pay every month the leftover is 134

        // x = y
        // x += y
        // x -= y

        // those three are the most important. they update the value of the variable increase/decrease
        // with string only + can be used.


    }


}
