package aHomeTasks.day08;

/*
Cigarettes

	2.  Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

        	Assume that the given number is 1 ~ 18
 */

public class Cigarette {

    public static void main(String[] args) {

        byte number = 11;

        boolean Elementary = number >= 1 && number <=5;
        boolean MiddleSchool = number >= 6 && number <8,
                highSchool = number >= 9 && number <12,
                college = number >= 13 && number <= 16,
                gradSchool = number >17 && number <= 18;

        if (Elementary){
            System.out.println("High school");
        }
        if (MiddleSchool){
            System.out.println("Middle School");
        }
        if (highSchool){
            System.out.println("Highschool");
        }
        if (college){
            System.out.println("College");
        }
        if (gradSchool){
            System.out.println("Grad School");
        }


    }

}
