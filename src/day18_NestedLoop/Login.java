package day18_NestedLoop;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your username");
        String u = scan.next();

        System.out.println("Enter your password");
        String p = scan.next();

        if( u.equals("CodeBastards") && p.equals("Simushy") ){
            System.out.println("Logged In");

        }else{

            for (int i = 0; i < 3; i++) { // if credentials don't match then repeat this !!
                System.err.println("Incorrect username or password");

                System.out.println("Enter your username");
                u = scan.next();
                System.out.println("Enter your password");
                p = scan.next();

                if(u.equals("CodeBastards") && p.equals("Simushy")){
                    System.out.println("Logged in");
                    break; // exits the loop
                }

            }

            if(  !(u.equals("CodeBastards") && p.equals("Simushy"))  ){
                System.err.println("Your account is locked, Please contact support team.");
            }


        }


scan.close();


    }


}
/*
You are writing a code for the log-in function of the CodeBastards Application, assume that your credentials are:
                            username: CodeBastards
                            password: Simushy

                Ask the user to enter their credentials.
                        If credentials are matched, your program should print "Logged in."
                        If the credentials are not matched, the program should allow the user to have three attempts to enter correct credentials and if all three attempts are failed, then print "Your account is locked."



Nested loop:  loop inside another loop (inner & outer loops)

        one iteration of the outer loop, executes all the iteration of the inner loop

 */