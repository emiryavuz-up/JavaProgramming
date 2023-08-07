package day10_NestedIf;

public class TernariesIntro {

    //shortcut of If Statements // ? is the if or else statement EX: (x >= 20)? "Println" : "Println";

    public static void main(String[] args) {

        int number = 100;


        if(number % 2 == 0){
            System.out.println("Even"); // String
        } else{
            System.out.println("Odd"); // String
        }
                    // SINCE ONLY STRING WILL BE USED = TERNARY WILL BE USED IN THE BELOW EXAMPLE
        System.out.println("--------------------------------");


        String result1 = (number % 2 == 0)? "Even" : "Odd"; // SAME MEANING AS ABOVE EXAMPLE

        System.out.println("result1 = " + result1);


        System.out.println("------------------------------------");

        int age = 23;

        String result2 = (age <= 23)? "Eligible to buy alcohol" : "Not eligible to buy alcohol";

        System.out.println("result2 = " + result2);

        System.out.println((age <= 21) ? "Eligible" : "Not Eligible" ); // ONLY SOUT CAN BE USED


        System.out.println("------------------------------------------");

        int number3 = 5;
        /*
        if (number >= 0){                     // INT
            System.out.println("Positive");
        }else if (number <=0){               // INT
            System.out.println("Negative");
        }else{                              // INT
            System.out.println("Zero");
        }
         // EVERY SINGLE BLOCK RETURNS ONE TYPE OF VALUE / SO BELOW ANOTHER EXAMPLE WITH TERNARIES
        */

        // (number>0)? "Positive" :(number<0)? "Negative" : "Zero"
        // = (number>0)? "Positive" :(number<0)? "Negative" : "Zero"
       String result3 = (number>0)? "Positive" :(number<0)? "Negative" : "Zero";
        System.out.println("result3 = " + result3);



    }


}
