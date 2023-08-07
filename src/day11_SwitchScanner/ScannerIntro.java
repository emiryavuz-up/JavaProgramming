package day11_SwitchScanner;

import java.util.Scanner; // scanner class is from util and util is from java package

public class ScannerIntro {

    public static void main(String[] args) {

    // after dot you can indicate that there is a sub package for the package
    // java.util package // utility classes //
    // scanner allows you to get the input
    // connect java with our keyboard basically
    // allows us to read whatever is typed on our keyboard
    // need to be imported in our program
    // scanner must be instantiated before it can be used.
    // the parameter System.in passed to the Scanner's constructor to connect the scanner to the keyboard
        // give the name a meaningful name like "input" to be make it usable

       //  Scanner input = new Scanner(System.in); // constructor of the scanner
        //type  //name                           // in this you need to pass an argument
                            //type name object and now program is linked to your keyboard

        Scanner input = new Scanner(System.in);
        //type  //name //new // choose scanner // type in System.in or out depending on the situation.
        //input.nextInt(); // when you run this program it will wait for you to provide input
        // so for one next int you should provide only one print

        System.out.println("Enter an integer"); // before user enters a number they will see this
                                                // so println is used before the method of scanner!!!!
        int num1 = input.nextInt(); // yes it can be assigned to int

        System.out.println("Enter a decimal");

       double num2 = input.nextDouble(); // by assigning to a variable you can use it again so its assigned to double

        System.out.println(num1);
        System.out.println(num2);
        System.out.println("Multiplication: "+ (num1*num2));


        input.close(); // closes the scanner. otherwise performance of your code will be slowed down



    }


}
