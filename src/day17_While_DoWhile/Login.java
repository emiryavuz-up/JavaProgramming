package day17_While_DoWhile;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your username:");
        String u = scan.next();

        System.out.println("Enter your password:");
        String p = scan.next();

        if( u.equals("CodeBastards") && p.equals("CodeBastards123") ){ // whatever you log in should be matched with this certain username and password = credentials are valid
            System.out.println("Logged in"); // if credentials are valid print out Logged in
        }else{ // what if the credentials are not valid

            int attempts = 3; // this variable contains the total attempts that user has. password incorrect limit

            while(   !(u.equals("CodeBastards") && p.equals("CodeBastards123")) && attempts > 0  ){ // only time user will be able to re-enter is if the credentials are invalid and user still has attempts // attempts is given here to give it an ending point otherwise it would be an infinite loop
                if(attempts == 1){ // when user has only one attempt left, this will be printed.
                    System.out.println("THIS IS YOUR LAST CHANCE");
                }
                System.err.println("Incorrect username or password");
                System.err.println("Enter your username");
                u = scan.next();

                System.err.println("Enter your password:");
                p = scan.next();
                attempts--;
            }

            if(u.equals("CodeBastards") && u.equals("CodeBastards123")){
                System.out.println("Logged in");
            }else{
                System.err.println("Your account is locked."); // if user enters more than 3 wrong answer
            }

        }

scan.close();

    }

}
/*
1. Write a program for the  marriage proposal program asking the user, "Will you marry me?"
    if the answer is yes, print "Congrats."
    if the answer is no, print "Goodbye"
    if the answer is neither yes nor no, print "Invalid answer, please re-enter" and repeat it until the user enters either yes or no


    2. You are writing a code for the log-in function of the Cybertek Application, assume that your credentials are:
                    username: CodeBastards
                    password: CodeBastards123

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to have three attempts to enter correct credentials and if all three attempts are failed, then print "Your account is locked."


 */