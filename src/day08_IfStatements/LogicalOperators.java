package day08_IfStatements;

public class LogicalOperators {

    public static void main(String[] args) {

                                                                                                                         /*
        "&&" means both
        "||" means either
         in logical or operator " || " only one expression needs to be true in order to return true
         in logical and operator " && "both of the expressions need to be true in order to return the true
                                                                                                                   */

        // checking conditions to check if something is eligible for both
        String name = "Umfufu";
        int age = 14;
        String citizen = "USA";

        boolean isEligible = age >= 18 && citizen == "Rwanda";
        //                  // 19 >= 18 && "Rwanda" = "Kenya"
                            // true     &&      false    ===>   false
        // both have to be true in order to get true result from &&
        // definition is BOTH, BOTH MUST BE TRUE, OR IT WILL ALWAYS BE FALSE
        // if the first definition is false do not use this "&&" expression

        System.out.println(name + " is eligible to vote in Rwanda: " + isEligible);

        String name2 = "talkativeAnt";
        int creditScore = 720;
        int age2 = 23;
        int income = 40000;


        //requirement to be eligible for a loan is 700 and age is 21 and income is 60000

        boolean isEligible2 = creditScore >= 700 && age2 >= 21 && income >= 60000; // && is used to say both is true

        System.out.println(name2 + " is eligible for a loan: " + isEligible2);


        // logical or operator means either. as long as either of the conditions are met the result is true

        String name3 = "Shay";

        int age3 = 21;
        char gender = 'F';

        boolean isEligibleToRegister = age3 >= 18 && (gender == 'M' || gender == 'F');

        //                        is 21 greater or equal so its true
        //                              'F' == 'M' = false          || 'F' == 'F' = true

        System.out.println(name + " is eligible to register: " + isEligibleToRegister);

        // talkativeMoth wants to be USA citizen

        String name4 = "talkativeMoth";

        String countryOfBirth = "UK";
        boolean marriedToUsCitizen = false;

        boolean isEligibleToBeCitizen = countryOfBirth == "USA" || marriedToUsCitizen == true;
                                            // false            //          false

        System.out.println(name4 + " is eligible to be citizen: " + isEligibleToBeCitizen);

        // in logical or operator " || " only one expression needs to be true in order to return true
        // in logical and operator " && "both of the expressions need to be true in order to return the true


        String student = "Smyrna";

        double gpa = 3.5;
        int familyIncome = 400000;

       // in order to be eligible for scholarship student must at least have 3.5 or family income needs to
        // be less than 60k

        boolean isEligibleForScholarship = gpa >= 3.5 || familyIncome <= 60000;

        System.out.println(student + " is eligible for scholarship: " + isEligibleForScholarship);


        boolean result2 = true;

        System.out.println("result2 = " + result2); // result is true

        boolean result3 = !result2; // result is false // opposite of result2


        int score = 55;

        boolean PassesTheExam = score >= 70,
                FailesTheExam = !PassesTheExam;

        System.out.println("PassesTheExam = " + PassesTheExam);
        System.out.println("FailesTheExam = " + FailesTheExam);


    }

    }

// execution depends on certain conditions
// before you go out of your room what choices do you make do you wear jacket or not
// wearing a hat or jacket depends on one or more conditions
// if an action needs to be executed under a condition you use if statement!!!!!
// so you specify your boolean condition and if its true it gets executed otherwise its not executed
// so we create singe if statement and if you have multiple conditions you create multiple statements

/*
after giving if (condition ) {
        Statements
}
 */