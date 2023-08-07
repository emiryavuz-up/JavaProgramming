package day09_IfStatements;

public class AgeGroup {


    public static void main(String[] args) {

        /*
        AgeGroups, and write a program that can define the age groups of a person

	             age groups are:
	                    infant (1 - 2)
	                    Toddler (3 - 5),
	                    Kid (6 - 9),
	                    Pre-Teen (10 - 12),
	                    Teenager (13 - 17),
	                    Young Adult (18 - 20),
	                    Adult (21 - 39),
	                    Young Middle-Aged Adult (40 - 49),
	                    Middle-Aged Adult (50 - 54),
	                    Very Young Senior Citizen (55 - 64),
	                    Young Senior Citizen (65 - 74),
	                    Senior Citizen (75 - 84),
	                    Old Senior Citizen (85+)
         */


        int number = 10;
        String a = "s";

        if (number >= 1 && number <= 2) {
            a = "Infant";
        } else if (number >= 3 && number <= 5) {
            a = "Toddler";
        } else if (number >= 6 && number <= 9) {
            a = "Kid";
        } else if (number >= 10 && number <= 12) {
            a = "Pre-Teen";
        } else if (number >= 13 && number <= 17) {
            a = "Teenager";
        } else if (number >= 18 && number <= 20) {
            a = "Young Adult";
        } else {
            System.out.println("loading...");
        }

        System.out.println(a + " is the Result");


    }


}
