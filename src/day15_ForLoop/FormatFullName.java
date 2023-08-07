package day15_ForLoop;

public class FormatFullName {

    public static void main(String[] args) {


        String firstName = "CodeBastards",
                lastName = "SCHOOL";

       //  firstName.charAt(0).toUpperCase cant be used because its int. so use substring to get text

       // firstName =  firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
            //C                             +   ydeo  ===> "CodeBastards"

        firstName = ("" + firstName.charAt(0) ).toUpperCase() + firstName.substring(1).toLowerCase();
                                                                  //      + ydeo  ===> "CodeBastards"
        // WAY OF CONCATING / CONVERTING CHAR AT TO A STRING TO PREVENT COMPILER ERROR

        lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();

        String fullName = firstName+" "+lastName;

        System.out.println(fullName);

    }
}
