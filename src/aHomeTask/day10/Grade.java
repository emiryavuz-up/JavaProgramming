package aHomeTask.day10;

public class Grade {

    public static void main(String[] args) {

    /*
    Grade, a char variable named grade is given. write a program to print the following messages:
            'A': excellent
            'B': great job
            'C': good
            'D': passed
            'F': failed
            otherwise: invalid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT

     */

            char grade = 'B';
            String result = "";

            if(grade >='A' && grade <= 'F'){

                if(grade == 'A'){
                    result = "Excellent";
                }else if (grade == 'B'){
                    result = "Great Job";
                }else if (grade == 'C'){
                    result = "Good";
                }else if (grade == 'D'){
                    result = "Passed";
                }else{
                    result = "Failed";
                }


            }else{
                System.out.println("Invalid");
            }

        System.out.println(result);
    }


}
