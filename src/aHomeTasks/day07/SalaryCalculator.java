package aHomeTasks.day07;

public class SalaryCalculator {

    /*
     Create a class called SalaryCalculator.java
			3.1 declare the following variables:
					hourlyRate, weeklyHours, stateTaxRate, federalTaxRate

			3.2 use the given info in above variables to calculate the followings:
					1. salaryBeforeTax
					2. stateTax
					3. federalTax
					4. totalTax
					5. salaryAfterTax

					Hint: salaryBeforeTax = hourlyRate * weeklyHour * 52
     */

    public static void main(String[] args) {


        int hourlyRate = 50;
        double weeklyHours = 45;
        double stateTaxRate = 0.06;
        double federalTaxRate = 0.26;


        double salaryBeforeTax = hourlyRate * weeklyHours * 52;
        double stateTax = salaryBeforeTax * stateTaxRate;
        double federalTax = salaryBeforeTax * federalTaxRate;
        double totalTax = stateTax + federalTax;
        double salaryAfterTax = salaryBeforeTax  - totalTax;


        System.out.println("salaryBeforeTax = $" + salaryBeforeTax);
        System.out.println("stateTax = $" + stateTax);
        System.out.println("federalTax = $" + federalTax);
        System.out.println("totalTax = $" + totalTax);
        System.out.println("salaryAfterTax = $" + salaryAfterTax);



    }


}
