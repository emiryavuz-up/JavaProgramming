package day05_Concatenation;

/*
declare the following variables
name
buildingNumber

 */

public class ShippingAddress {

    public static void main(String[] args) {

        String name = "James King",
                buildingNumber = "12321BB4",
                streetName = "Jones Branch Dr",
                city = "McLean",
                state = "Burdur",
                zipCode = "231AT5";

        String address = name + "\n" + buildingNumber + " " + streetName + "\n" + city + ", " + "\n" + state + " " + zipCode;

        System.out.println("Address is:\n" + name + "\n" + buildingNumber + " " + streetName + "\n" + city + "\n" + state + " " + zipCode + "\n");

        System.out.println("Address is:\n" + address);


    }


}

