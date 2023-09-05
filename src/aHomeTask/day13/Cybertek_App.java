package aHomeTask.day13;

import java.util.Scanner;

public class Cybertek_App {

    public static void main(String[] args) {

        /*
        You are writing a code for the log-in function of the Cybertek Application,
        assume that your credentials are:
                    username: CodeBastards
                    password: Simushy


        Ask the user to enter their credentials.
         If credentials are matched, your program should print "Logged in."
        otherwise print "Incorrect username or password" as error message

    	Hints: 	In order to login, both username and password MUST be correct
    			you will need to use equals() method

         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your username:");
        String username = scan.next();

        System.out.println("Enter your password:");
        String password = scan.next();
        scan.close();

        String correctU = "CodeBastards";
        String correctP = "Simushy";

        if(username.equals(correctU) && password.equals(correctP)){
            System.out.println("Logged in");
        }else{
            System.err.println("Incorrect username or password");
        }


    }
}
