package day10_NestedIf;

public class TernariesWithNestedIf {

    public static void main(String[] args) {



      /*
        if(s >= 0 && s <= 100){ // STRING

            if(s >= 60){ // STRING
                System.out.println("Passed");
            }else{
                System.out.println("Failed");
            }


        }else{ // STRING
            System.out.println("Invalid Score");
        }
        */

        int s = 85;

        String result = (s >= 0 && s <= 100)? (s >= 60)? "Passed" : "Failed" : "Invalid Score"; // 2 question mark 2 columns
                        // pre condition //

        System.out.println("result = " + result);
    }
}
