package aHomeTasks.day23;

import java.util.Scanner;

public class EligibleToVote {

    public static void main(String[] args) {

        eligibleToVote();

    }

    public static void eligibleToVote(){
    Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age");
    int age = scan.nextInt();

        System.out.println("Enter your nationality (1 word)");
    String nationality = scan.next();

        if(age >= 18 && nationality.equals("USA")){
        System.out.println("Eligible to vote");
    }else{
        System.out.println("Not eligible to vote");
    }
scan.close();
}

}
/*
4. create a method that can check if a person is eligible to vote
			Ex:
				eligibleToVote(19, "USA");

			output:
				You are not eligible to vote!
 */