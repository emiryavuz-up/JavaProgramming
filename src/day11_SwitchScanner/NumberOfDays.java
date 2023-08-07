package day11_SwitchScanner;

public class NumberOfDays {

    public static void main(String[] args) {

          /*
        NumberOfDays
        28 Days: 2
        30 Days: 4, 6, 9, 11
        31 Days: 1, 3, 5, 7, 8, 10, 12
        invalid should be included
         */

        //  " || " logic can be used in switch by declaring case blocks back to back

        int year = 1984;
        int number = 5;
        String result = "";

        if(number >= 1 && number <= 12){

            switch (number){ // switch as its name suggests means that number will be equal like using ==
                case 2: // right below
                 //   result = (year % 4 == 0)? "29 Days" : "28 Days"; // THIS CAN BE ALSO GIVEN AS SWITCH

                    if(year % 4 == 0){ // TYPICAL IF ELSE BLOCK WITH BREAK AFTERWARDS SO MIXED TOGETHER
                        result = "29 Days";
                    }else{
                        result = "28 Days";
                    }
                    break;


                case 4: case 7: case 9: case 11: // OR LOGIC WITHOUT BOOLEAN WITH SWITCH
                    result = "30 Days";
                    break;

                default:
                    result = "31 Days";
            }

        }else{

            System.out.println("Invalid Answer");

        }

        System.out.println(result);

    }


}
