package day07_Operators;

public class RelationalOperators {

    public static void main(String[] args) {

        /*
        Operators:
	+, -, *, /, %
	++, --
	=, +=, -=
	>, <, >=, <=, ==, !=

	greater than or equal = ">="
	less than or equal = "<="

	USED WITH BOOLEAN TO GET T/F RESULT
         */

        boolean result1 = 20 > 40;
        boolean result2 = 40 > 20;

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);

        boolean result3 = 40 >= 20; // is 40 greater or equal to 20 // WRITE TRUE BY BOOLEAN!!!
        System.out.println("result3 = " + result3);

        boolean result4 = 100 >= 100; // since its equal it'll be TRUE
        System.out.println("result4 = " + result4);
        boolean result5 = 100 >= 101;
        System.out.println("result5 = " + result5);

        //credit score of 720

        int creditScore = 745;

        boolean isEligibleForLoan = creditScore >= 720; // if the credit score is 720 or greater
                                                       // then its eligible for the loan

        System.out.println("isEligibleForLoan = " + isEligibleForLoan);

        boolean result6 = 200 < 180; // false
        boolean result7 = 180 < 200; // true

        boolean result8 = 200 <= 180;

        int score = 59;

        boolean hasPassed = score <= 60;
        boolean hasFailed = score <= 57;
        System.out.println("hasPassed = " + hasFailed);
        System.out.println("hasFailed = " + hasPassed);


        System.out.println("==================================");

        //  = this is for assigning value to a specific variable or change the value of a variable
        // but you can not compare

        // therefore

        int x = 100;
        int y = 200;

        boolean equal = x==y; // to make it equal

        System.out.println("equal = " + equal);

        boolean result213123 = "Muhtar" == "Good Guy" ;
        System.out.println("result213123 = " + result213123); // string

        boolean result9184 = 'A' == 'a'; // char this is char
        System.out.println("result9184 = " + result9184); // upper and lower case is different

        boolean result566 = "Java" == "Java"; // EVEN SPACES ARE IMPORTANT OR IT WILL BE FALSE
        System.out.println("result566 = " + result566);


        // Not Equal

        boolean result34 = 100 != 200; // 100 DOES NOT equal to 200 // true

        System.out.println("result34 = " + result34); // TRUE

        boolean result35 = "Java" != "Space";
        System.out.println("result35 = " + result35); // FALSE

        boolean result32 = "Yes300" != "Yes300";
        System.out.println("result32 = " + result32); // TRUE


    }


}
