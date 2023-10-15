package JavaRecap;

public class day14_StringMethods {

    public static void main(String[] args) {

        String email = "craig_federighi@apple.com";

        String firstName = email.substring(0, email.indexOf("_") ); // "craig"
        String lastName = email.substring(email.indexOf("_")+1, email.indexOf("@"));  //"federighi"
        String domain = email.substring(email.indexOf("@")+1, email.lastIndexOf("."));

        System.out.println("First Name: " + firstName.toUpperCase().charAt(0) + firstName.substring(1)); // first make the first letter upper case then prints the rest of the first name
        System.out.println("Second Name: " + lastName.toUpperCase().charAt(0) + lastName.substring(1)); // first make the first letter upper case then prints the rest of the last name
        System.out.println("Domain: " + domain);

    }

}
/*
Create a class called EmailTask2.
       Assume that email address is constructed by person's first name and followed by an underscore and last name.

       Write a program that will print out information about user based on email. Print first name, last name, and domain.

       First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.

               Ex:
                   input:
                       craig_federighi@apple.com

                Output:
                    First name: Craig
                    Last name: Federighi
                    Domain: apple
 */