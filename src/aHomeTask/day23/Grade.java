package aHomeTask.day23;

public class Grade {

    public static void main(String[] args) {

        grade(70);

    }

    public static void grade(int score){


        String result = "";

        if(score >= 90){
            result = "A";
        }else if(score >= 80){
            result = "B";
        }else if(score >= 70){
            result = "C";
        }else{
            result = "F";
        }

        System.out.println("Grade is: " + result);

    }


}

/*
create a method that can calculate the grade of the student based on the score
 */