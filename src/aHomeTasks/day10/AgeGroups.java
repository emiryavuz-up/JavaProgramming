package aHomeTasks.day10;

public class AgeGroups {

    public static void main(String[] args) {

    /*
    AgeGroups, write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( >= 55 )

             if age is negative or greater than 150, print invalid
     */

        int age = 20;
        String result = "";
        boolean agegroup = age <= 21 && age >= 55;

        if(agegroup){

            if(age <= 21){
                result = "Teenager";
            }else if (age >= 21 && age <= 55){
                result = "Adult";
            }else if (age >= 55){
                result = "Senior";
            }else {
                result = "Invalid";
            }

        }


    }


}
