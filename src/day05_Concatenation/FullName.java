package day05_Concatenation;

public class FullName {

    public static void main(String[] args) {

        // declare the following variables = firstName + lastName

        String firstName = "Emir";
        String lastName = "Yavuz";
        String fullName = firstName + " " + lastName;
        int age = 45;
        String jobTitle = "campaign specialist";
        String companyName = "gpartner";
        int salary = 5000;


        System.out.println(firstName + " " + lastName);
        // Full name of the person is ______

        System.out.println("fullName = " + fullName);

        System.out.println("Full name of the person is " + fullName);

        // ____is___years old

        System.out.println(fullName + " is " + age + "years old");

        //fullName is jobTitle +, works at + companyName and fullName's salary

        System.out.println(fullName + " is a " + jobTitle + ", works at " + companyName + ", " + fullName + "'s salary is " + salary );

    }
}
