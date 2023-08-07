package aHomeTask.day13_14;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        /*
         You are writing a code for the log-in function of the Cybertek Application, assume that your credentials are:
                    username: CodeBastards
                    password: Simushy

        Ask the user to enter their credentials. If credentials are matched,
        your program should print "Logged in."
        otherwise print "Incorrect username or password" as error message

    	Hints: 	In order to login, both username and password MUST be correct
    			you will need to use equals() method

         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your username"); // display message
        String username = scan.next(); // user input

        System.out.println("Enter your password");
        String password = scan.next();
        scan.close();


        String correctU = "CodeBastards";
        String correctP = "Simushy";
        String result = "";

        if(username.equals(correctU) && password.equals(correctP)){
            result = "Logged in";
        }else{
            result = "Incorrect username or password";
        }
        System.out.println(result);

    }


}
