package day04_Variables;

public class Employee_Info {

    public static void main(String[] args) {

    /*
    6. Create a class named EmployeeInfo. declare the following variables:
				1. name (String)
				2. age (int)
				3. gender (char)
				4. company (String)
				5. jobTitle (String)
				6. yearsOfExpereince (double)
				7. salary (int)
				8. isFullTime (boolean)
				9. isMarried (boolean)
				10. employeeId (String)
				11. SSN (String)

     */
 // string : ozel karakter, harf, isim ve numara ayni anda yazilmasi icin kullanilir

        String name = "Emir"; // string tirnakla yazilir
        int age = 28;
        char gender = 'M'; // char her zaman bir tirnak ile yazilir
        String company = "G Partner";
        String jobTitle = "Campaign Specialist";
        double yearsOfExperience = 1;
        int salary = 5000;
        boolean isFullTime = true;
        boolean isMarried = false;
        String employeeID = "E4340430";
        String SSN = "12321321N(&%£";

        System.out.println("SSN = " + SSN);
        System.out.println("employeeID = " + employeeID);
        System.out.println("isFullTime = " + isFullTime);
        System.out.println("salary = " + salary + " PLN");
        System.out.println("yearsOfExperience = " + yearsOfExperience);
        System.out.println("jobTitle = " + jobTitle);
        System.out.println("company = " + company);
        System.out.println("gender = " + gender);
        System.out.println("age = " + age);
        System.out.println("name = " + name);


    }


}
