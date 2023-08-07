package day08_IfStatements;

public class GradeReport {

    public static void main(String[] args) {

        /*
        System.out.println( true == !false ); // true
        System.out.println( !true != false ); // false does not equal to false so result is false
        System.out.println( !false == true ); // true

        System.out.println(!!false); // false
        System.out.println(!!!true); // false // false true false from right to left it just takes opposite
*/
        //requirement of the task
        //score of the student is 85
        //print the following messages = if the student gets excellent and or great and or good and or passed and or below average etc

        /*
        score:
        100 ~ 90 ===> Excellent
        80 ~ 89 ===> Great
        70 ~ 79 ===> Good
        60 ~ 69 ===> Passed
        0 ~ 59 ===> failed
         */

        int score = 85; // 0 ~ 100

        boolean a = score >= 90 && score <= 100; // either 90 or greater AND equal or less than 100

        boolean b = score >= 80 && score <= 89; // score is greater or equal to 80
        // boolean great = excellent >= 80 && !great // if the score is not excellent
        boolean c = score >= 70 && score <= 79;
        // boolean good = !excellent && !great && score >= 70
        boolean d = score >= 60 && score <= 69;

        boolean f = score >= 0 && score <= 69;
        // boolean f = !a && !b && !c && !d

        if(a) { // if the student get Excellent score
            System.out.println("Excellent");
        }

        if(b) { // if the student get Great score
            System.out.println("Great");
        }

        if(c) { // if the student get good score
            System.out.println("Good");
        }

        if(d) { // if the student passed this will be printed
            System.out.println("Passed");
        }


        if (f) { // if the student failed this will be printed
            System.out.println("Failed");
        }

    }


}
