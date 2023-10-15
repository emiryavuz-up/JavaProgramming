package aHomeTasks.day13;

import java.util.Scanner;

public class Travel {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Do you have a valid passport (yes or no)");
        String passport = scan.next().toLowerCase();

        scan.nextLine();

        System.out.println("Which country do you travel to?");
        String country = scan.nextLine();


        System.out.println("How many bags will you take with you?");
        byte bags = scan.nextByte();

        System.out.println("How many people do you travel with?");
        short people = scan.nextShort();

        scan.nextLine();

        System.out.println("Enter the name of the people that you travel with in one? (Seperate each name with a comma)");
        String name = scan.nextLine();

        String result = "";



        int bagCost = people * 50;

        int costOfTicket = 1000;

        int groupDiscount = costOfTicket - 100;

        int totalDiscount = bagCost + groupDiscount;

        int costAmount = costOfTicket - totalDiscount;

        if(passport == "yes"){
            result = "Your ticket is booked to " + country + ". We have charged extra for the " +
                    bags + " but you are traveling with " + people + " so we are giving a discount.\nYour total cost is: " + totalDiscount;

        }else{
            // no you buraya yazacaz
        }
        scan.close();

        /*
        "Your ticket is booked to $countryName. We have charged extra for the $numberOfBags bags
         but you are traveling with $peopleYouTravelWith so we are giving a discount.
          Your total cost is $costAmount"
         */

    }


}
 /*
    Travel. Make a cost variable to calculate how much the person will owe after everything.
		Ask the user if they have a valid passport (yes or no)
			If the user enters yes:
		The base cost of the ticket should be set to: 1000
        Ask the user the country they to travel to (String, multiple word)
        Ask the user how many bags they will take with them (byte)
        > Each bag will add 50 to the cost
        Ask the user how many people they will travel with (short)
        > For each person the cost is reduced by 100. Up to a limit of 300.
        Ask the user to Enter the name of the people they will travel with in one line,
        separating each name with a comma (String, multiple word)

        Print: "Your ticket is booked to $countryName. We have charged extra for the $numberOfBags bags
         but you are traveling with $peopleYouTravelWith so we are giving a discount.
          Your total cost is $costAmount"


    		If the user enters no:
    				The base cost of the passport renewal is: 200
		            Ask the user when their passport expired(int)
		                > Each year it was expired adds 75 to the cost
        			Ask the user which country they plan to travel
		            Ask the user if they will be traveling in the next year (String - yes or no)
		                > If yes: add 100 to the cost
		                > If no: subtract 50 from the cost

        			Print: "Looks like your password has been expired for $years,
        			but not to worry we will get it ready for you to travel to $allCountries.
        			Your total cost has come out to $costAmount."


     */
