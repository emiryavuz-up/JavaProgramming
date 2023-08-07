package day11_SwitchScanner;

public class DaysInWeek {

    public static void main(String[] args) {

        //name of the day // ONLY USING COMPARE SO IT CAN BE CONVERTED TO THE SWITCH STATEMENT

        // decimals cant be used because it doesn't accept double or float

        // only break or curly brace will exit the switch.

        // otherwise it gets executed together with the next line

        // compiler does not check the conditions one by one but goes to the right condition right away

     int number = 5; // long float double boolean is not be accepted // it should be assigned to a single value

     switch (number){// 1 , 2 , 4 , 5 , 6 , 7 only " == " can be used // data type cant be double float boolean or long

         case 1: // as a condition case block is given // it should be unique as it should be the opposite
             System.out.println("Monday");
             break;  // in order to exit the switch, break statement is given//when not given block will continue

         case 2: // case is used with column not curly braces
             System.out.println("Tuesday");
             break; // exits the switch after executing the block // if not it gets executed with the next block

         case 3: // means (number == 3) // AND ONLY "==" CAN BE USED FOR SWITCH!!
             System.out.println("Wedneday");
             break; // exits the switch after executing the block // if not it gets executed with the next block

         case 4:
             System.out.println("Thursday");
             break; // exits the switch after executing the block // if not it gets executed with the next block

         case 5:
             System.out.println("Friday");
             break; // exits the switch after executing the block // if not it gets executed with the next block

         case 6:
             System.out.println("Saturday");
             break; // exits the switch after executing the block // if not it gets executed with the next block
         case 7:
             System.out.println("Sunday");

         default: // only gets executed if none of the conditions are matched.
             // you can only have one default block

             System.out.println("Invalid");
             break; // THIS BREAK IS OPTIONAL BECAUSE IT WILL EXIT WITH THE NEXT CURLY BRACE!!!!!!!

     } // this curly brace belongs to the switch above // this curly brace belongs to the switch above
        // above curly brace belongs to the switch above // above curly brace belongs to the switch above


    }

}
