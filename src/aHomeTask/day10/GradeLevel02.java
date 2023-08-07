package aHomeTask.day10;

public class GradeLevel02 {


    public static void main(String[] args) {

        byte grade = 13;
        String result = "";
        boolean validNumber = grade >= 1 && grade <= 18;

        if(validNumber){

        }if (grade >= 17){
            result = "Grad School";
        }else if (grade >= 13){
            result = "College";
        }else if (grade >= 9){
            result = "High School";
        }else if (grade >= 6){
            result = "Middle School";
        }else if (grade >= 1){
            result = "Elementary School";
        }else{
            result = "Invalid Grade Level Given";
        }

        System.out.println(result);

    }


}
