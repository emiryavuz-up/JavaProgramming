package day10_NestedIf;

public class GradeReportNestedIf {

    public static void main(String[] args) {

    /*
     if(score >= 0 && score <= 100){ // IF THE SCORE IS BETWEEN 0 AND 100 NEXT CONDITIONS WILL BE CHECKED

            if(score >= 90){
               result = "Excellent";
            }else if (score >= 80){
                result = "Great";
            }else if (score >= 70){ // false: score < 70 IT IS IMPLICITY GIVEN
                result = "Good";
            }else if (score >= 60){
                result = "Passed";
            }else{
                result = "Failed";
            }

        }else {
            result = "Invalid";
        }
     */

        int grade  = 45;

       // (grade >= 90)? (grade <= 100)? "Excellent" : (grade >= 80)? (grade <= 89)?

       String result = (grade >= 0 && grade <= 100)? (grade >= 90)? "Excellent" : (grade >= 80)? "Great"
               : (grade >= 70)? "Good" : (grade >= 60)? "Passed" : "Failed"  : "Invalid Score";

        System.out.println("result = " + result);


        System.out.println("--------------------------");

        // MIXED EXAMPLE BELOW.

        // BOTH IF AND TERNARIES

        String result2 = "";
        if(grade >= 0 && grade <= 100){

            result2 = (grade >= 0 && grade <= 100)? (grade >= 90)? "Excellent" : (grade >= 80)? "Great"
                    : (grade >= 70)? "Good" : (grade >= 60)? "Passed" : "Failed"  : "Invalid Score";
        }else {
            System.out.println("Invalid");
        }
        System.out.println("result2 = " + result2);
    }


}
