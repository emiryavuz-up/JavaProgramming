package aHomeTasks.day09;

public class Practice {

    /*
    Female or Male
		Pass or Fail
		Married or not Married
		employeed or not employeed
		Odd or Even
		Enligible or not eligible

     */

    public static void main(String[] args) {

        //pass or fail
        // 75>=

        int score = 80;

        if (score >= 75){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }

        System.out.println("________________________________________________________");

        // married or not married

        boolean married = false;

        if(married){
            System.out.println("Married");
        }else{
            System.out.println("Single");
        }

        System.out.println("________________________________________________________");


        // employeed or unemployed

            boolean employed = true;

            if(employed){
                System.out.println("Employed");
            }else{
                System.out.println("Unemployed");
            }

        System.out.println("________________________________________________________");

            // odd or even

        int sayi = 24;

        if(sayi % 2 == 1){
            System.out.println("Odd");
        }else{
            System.out.println("Even");
        }

        System.out.println("________________________________________________________");

        // eligible not eligible

        int age = 100;

        if(age >= 18){
            System.out.println("Eligible");
        }else{
            System.out.println("Not Eligible");
        }

        System.out.println("________________________________________________________");

        // 1. Maximum number between two different numbers

        int number1 = 200,
                number2 = 300;

        if (number1 > number2){
            System.out.println(number1);
        }else{
            System.out.println(number2);
        }

        // grade report ==> A, B, C, D, F
        /*
        100 ~ 90 ===> Excellent
        80 ~ 89 ===> Great
        70 ~ 79 ===> Good
        60 ~ 69 ===> Passed
        0 ~ 59 ===> failed
         */

        int grade = 94;

        if(grade >= 0 && grade <= 59){
            System.out.println("Failed");
        } else if (grade >= 60 && grade <= 69) {
            System.out.println("Passed");
        } else if (grade >= 70 && grade <= 79) {
            System.out.println("Good");
        } else if (grade >= 80 && grade <= 89) {
            System.out.println("Great");
        } else{
            System.out.println("Excellent");
        }

        System.out.println("--------------------------------------------------------");

                // eligible to buy alcohol

                int ageee = 5;

                if(ageee >= 18){
            System.out.println("Eligible To Buy Alcohol");
        }else{
            System.out.println("Not Eligible To Alcohol");
        }
    }


}
