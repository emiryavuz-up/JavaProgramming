package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {

    public static void main(String[] args) {

        new Offer(); // object of the offer is created from the class

        // to make it re-usable we create a variable name and assign this to it

        Offer offer1 = new Offer();

        System.out.println(offer1); // this prints null

        // so to set the attributes and instead of calling them one by one like ==> offer1.location = "Warsaw"
        // to save ourselves time and be more efficient
        // we created setInfo method and will use it like below

        offer1.setInfo("Warsaw", "Google", "SDET",25000, true, true, true, true);

        Offer offer2 = new Offer();
        offer2.setInfo("California", "Independent", "Senior QA", 75000, false, true,true, true);
        System.out.println(offer1 + "\n" + offer2);
        Offer offer3 = new Offer();
        offer3.setInfo("Adana", "Sokak", "Torbaci", 100000, false,false,false,false);
        Offer offer4 = new Offer();
        offer4.setInfo("Mars", "Rocket Scientist", "something", 10500, false,false,false,false);
        Offer offer5 = new Offer();
        offer5.setInfo("unknown", "unknown", "unknown", 1582400000, false,false,false,false);

        Offer[] myOffers = {offer1, offer2, offer3, offer4, offer5}; // array can;t be converted to collection type so we use asList method

        ArrayList<Offer> fullTimeOffers = new ArrayList<>(Arrays.asList(myOffers));

        fullTimeOffers.removeIf(p -> !p.isFulltime ); // p represents each of the offer // removes if the offer is not full time to see only the full time offers
        // to see how many full time offers we have we can check like below
        System.out.println("How many full time offers = " + fullTimeOffers.size());

        ArrayList<Offer> localOffers = new ArrayList<>(Arrays.asList(myOffers));
        localOffers.removeIf(p -> p.location.equals("Adana")); // removes the offer if the offer is not from local area

        System.out.println("Offers from local area = " + localOffers.size());

        System.out.println(Arrays.toString(myOffers));

        for(Offer localOffer : localOffers){
            System.out.println(localOffer.companyName + " : " + localOffer.salary); // loop is used to get the attributes of the offer

        }


    }

}
