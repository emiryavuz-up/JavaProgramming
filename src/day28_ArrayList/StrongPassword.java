package day28_ArrayList;

public class StrongPassword {

    public static void main(String[] args) {

        String password = "Smyrna2018@";
        boolean isStrongPassword = isStrongPassword(password);

        System.out.println("Is Strong Password? " + isStrongPassword);

    }

    public static boolean isStrongPassword (String password){

        boolean r1 = password.length() >= 8 && !password.contains(" ");
        boolean r2 = false; // temporary value of this boolean variable
        boolean r3 = false; // if this has one lower case we will set it to true in the next string of codes
        boolean r4 = false; // has special char
        boolean r5 = false; // has digit

        // check each char and if they match with the string, set above boolean expressions to true

        // we will use the loop to check, if condition is met, boolean variable will be set to true

        // we can also use regular for loop "fori" but it would take more time, so we use array

        char[] chars = password.toCharArray(); // each character of the string password

        for (char each : chars) {
            if(Character.isUpperCase(each)){ // if one of the characters of string contains at least one upper case letter
                r2 = true; // set r2 as true
            }else if(Character.isLowerCase(each)){ // if one of the characters of string contains at least one lower case letter
                r3 = true; // set r3 as true
            }else if(Character.isDigit(each)){ // if there is at least one digit in the characters of string
                r5 = true; // set r4 as true
            }else{ // if special char
                r4 = true;
            }


            /*
            if(r2 && r3 && r4 && r5){
                break;
            }
             */

        }

        boolean isStrongPassword = r1 && r2 && r3 && r4 && r5;

        return isStrongPassword;

    }

}

/*
Warmup tasks:
	1.Write a program that can verify if a password is a strong password.
	Characteristics of strong passwords are:
        1.1 Password must be at least have 8 characters long, and should not contain space
        1.2 PassWord should at least contain one upper case letter
        1.3 PassWord should at least contain one lower case letter
        1.4 Password should at least contain one special characters
        1.5 Password should at least contain a digit

 */