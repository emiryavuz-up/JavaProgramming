package day12_Scanner;

public class GradeLevel {

    public static void main(String[] args) {

            /*
            GradeLevel, Given a number(byte) grade level determine and print which school type someone is in.
                grade level and types are:
                        1-5: Elementary school
                        6-8: Middle school
                        9-12: High school
                        13-16: College
                        17-18: Grad School

                        For Any Other grade: Invalid grade level given
             */


                    // if you dont have pre condition you need to add each of them with switch
                // switch(number{
                            // case 1: case 2: case 3: case 4: case 5:
                            // result = "Elementary School";
        byte number = 14;
        String result = "";


        // if they are back to back it means they execute the same

        if(number >= 1 && number <= 18){

            switch (number){ // 1 `~ 18 so the 1-5 default block at the end will be checked

                case 6: case 7: case 8:
                    result = "Middle School";
                    break;

                case 9: // ABOVE EXAMPLE OF BACK TO BACK IS BETTER SINCE IT IS MORE READABLE..!!!..!!.!!!!..!
                case 10:
                case 11:
                case 12:
                    result = "High School";
                    break;

                case 13: case 14:case 15: case 16:
                    result = "College";
                    break;

                case 17: case 18:
                    result = "Grad School";
                    break;

                default: // == 1 ~ 5
                    result = "Elementary School";
                    break;

            }
        }else {
            result = "Invalid ";
        }
        System.out.println(result);




        System.out.println("---------------------------");



    }

}
