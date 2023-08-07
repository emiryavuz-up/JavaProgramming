package aHomeTask.day08;

public class NameOfTheDay {

    /*
    	2. write a program that can display the name of the day

			number = 1 ~ 7
     */

    public static void main(String[] args) {

        int numberOfTheDay = 1;

        boolean firstDay = numberOfTheDay == 1;
        boolean secondDay = numberOfTheDay == 2;
        boolean thirdDay = numberOfTheDay == 3;
        boolean fourthDay = numberOfTheDay == 4;
        boolean fifthDay = numberOfTheDay == 5;
        boolean sixthDay = numberOfTheDay == 6;
        boolean seventhDay = numberOfTheDay == 7;

        if(numberOfTheDay == 1){
            System.out.println("Monday");
        }
        if(secondDay){
            System.out.println("Tuesday");
        }
        if(thirdDay){
            System.out.println("Wednesday");
        }
        if(fourthDay){
            System.out.println("Thursday");
        }
        if(fifthDay){
            System.out.println("Friday");
        }
        if(sixthDay){
            System.out.println("Saturday");
        }
        if(seventhDay){
            System.out.println("Sunday");
        }



    }


}
