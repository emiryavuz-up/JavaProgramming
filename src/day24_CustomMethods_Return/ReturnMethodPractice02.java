package day24_CustomMethods_Return;

public class ReturnMethodPractice02 {

    public static void main(String[] args) {


    grade(50);

    String str1 = grade(95); // assigned to a variable to be used again

        // let's re-use str1 (method that we created below)

        String print = "";
        if(str1.equals("A")){
            print = "Excellent";
        }else if(str1.equals("B")){
            print = "Great";
        }else if(str1.equals("C")){
            print = "Good";
        }else if(str1.equals("D")){
            print = "Passed";
        }else{
            print = "Failed";
        }
        System.out.println(print);


    }

    public static String grade(int score){

        String result = "";

        if(score < 0 || score > 100){
            result = "Invalid score, program is terminated";
            System.exit(0);
        }

        result = (score >= 90)? "A" : (score >= 80)? "B" : (score >= 70)? "C" : (score >= 60)? "D" : "F";

        return result;


    }



}
