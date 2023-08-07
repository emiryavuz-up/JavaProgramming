package day11_SwitchScanner;

public class Grade {

    public static void main(String[] args) {

        char ch = 'B'; // == // switch will be used because it will be faster than else if statements
                            // and is accepted because its char
        String result = "";

        switch(ch){
            case 'A':
                result = "Excellent"; // String result is initialized with "Excellent"
                break;
            case 'B': // String result is initialized with "Great"
                result = "Great";
                break;
            case 'C': // String result is initialized with "Good"
                result = "Good";
                break;
            case 'D':
                result = "Passed";
                break;
            case 'F':
                result = "Failed";
                break;
            default:
                result = "Invalid";

        }

        System.out.println(result);


    }


}
/*
a char variable named grade is given. use switch statement to print the following messages:
			'A': excellent
			'B': great job
			'C': good
			'D': passed
			'F': failed
			other wise: invalid

 */