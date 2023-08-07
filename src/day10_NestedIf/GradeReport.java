package day10_NestedIf;

public class GradeReport {


    public static void main(String[] args) {

        /*
        90 ~ 100: Excellent
        80  ~ 89: Great
        70 ~  79:  Good
        60 ~  69: Passed
        0  ~  59: Failed

         */
        // REASON WHY "&&" IS NOT USED EX. ( SCORE >= 90 && SCORE <= 100 )
        // IF THE FIRST IS TRUE THE NEXT WILL NOT BE EXECUTED ANYWAY

        int score = 95;
        String result = ""; // since I'll only need String as a variable to print I'll use it for each
        // "" is temporary value just to avoid compile error.
        //  it needs to be initialized first to be used later

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


        System.out.println("-------------------------");





    }


}
