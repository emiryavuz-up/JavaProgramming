package day10_NestedIf;

public class NestedIfIntro {

    public static void main(String[] args) {

        //nested if

        int score = 450;

        if (score >= 0 && score <= 100) { // if the score is valid then other options will be checked


            if (score >= 60) {

                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }

        } else { // if the score is not valid
            System.out.println("Invalid Score");
        }

        System.out.println("---------------------------------------------");


        int age = 12;
        boolean hasID = true;

        if(hasID){ // if the person has ID the other options will be checked. if the person is >= 21


        if(age >= 21){
            System.out.println("Eligible to buy alcohol");
        }else{
            System.out.println("Not eligible to buy alcohol");
        }

    }else{ // THIS IS THE OPPOSITE OF THE PRE-CONDITION !! THIS "ELSE" BELONGS TO THE FIRST "IF"
            System.out.println("You must have ID to buy alcohol");
        }

        System.out.println("---------------------------------------------");

        int number = 26;

        if(number >= 1 && number <= 7 ) { // if the number is a valid number (1~7)


            // compiler does not check these options if the above statement is not matched.
            // therefore goes to the "else" at the end
            if (number == 1){
                System.out.println("Monday");
            }else if (number == 2){
                System.out.println("Tuesday");
            } else if (number == 3){
                System.out.println("Wednesday");
            } else if (number == 4){
                System.out.println("Thursday");
            } else if (number == 5){
                System.out.println("Friday");
            } else if (number == 6){
                System.out.println("Saturday");
            } else{
                System.out.println("Sunday");
            }


        }else {
            System.out.println("Invalid Number");
        }


    }




}
