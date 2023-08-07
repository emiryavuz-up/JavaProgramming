package aHomeTask.day07;

public class NameOfTheMonth {

    /*
      /*
        1. write a program that can display the name of the month

			number = 1 ~ 12
         */


    public static void main(String[] args) {

        int monthNumber = 1;

        boolean firstMonth = monthNumber == 1;
        boolean secondMonth = monthNumber == 2;
        boolean thirdMonth = monthNumber == 3;
        boolean fourthMonth = monthNumber == 4;
        boolean fifthMonth = monthNumber == 5,
                sixthMonth = monthNumber == 6,
                seventhMonth = monthNumber == 7,
                eightMonth = monthNumber == 8,
                ninthMonth = monthNumber == 9,
                tenthMonth = monthNumber == 10,
                eleventhMonth = monthNumber == 11,
                twelveMonth = monthNumber == 11;

        if (firstMonth) {
            System.out.println("January");
        }
        if (secondMonth) {
            System.out.println("February");
        }
        if (thirdMonth) {
            System.out.println("March");
        }
        if (fourthMonth) {
            System.out.println("April");
        }
        if (fifthMonth) {
            System.out.println("May");
        }
        if (sixthMonth) {
            System.out.println("June");
        }
        if (seventhMonth) {
            System.out.println("July");
        }
        if (eightMonth) {
            System.out.println("August");
        }
        if(ninthMonth){
            System.out.println("September");
        }
        if(tenthMonth){
            System.out.println("October");
        }
        if(eleventhMonth){
            System.out.println("November");
        }
        if (twelveMonth){
            System.out.println("December");
        }


    }


}
