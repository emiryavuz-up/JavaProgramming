package day11_SwitchScanner;

public class Grade02 {

    public static void main(String[] args) {

        char ch = 'A'; // declare back to back. if the first condition is not met the next will be checked
        String result = "";

        switch (ch){ // the next block gets executed long as the current is not matched
            case 'A':
            case 'B':
            case 'C':
            case 'D':
                result = "Passed";

            case 'F':
                result = "Failed";

            default:
                System.out.println("Failed");
        }

        System.out.println(result);

        // switch does not accept boolean therefore case 'A': || case 'A'; CAN NOT BE USED ITS BOOOLEEEAAN

    }


}

/*
    if the grade is A or B or C or D ======> "Passed"
    otherwise =====> = "Failed"

 */