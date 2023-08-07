package day08_IfStatements;

public class SalaryCalculator {


    public static void main(String[] args) {
        // 4 variables you need to declare first

        int hourlyRate = 50,
                weeklyHours = 45; // how many hours a person works per week

        double stateTaxRate = 6.5, // since it's decimal use double. in order to get the percentage to decimal
                federalTaxRate = 26.2;

        int salaryBeforeTax = hourlyRate * weeklyHours * 52; // salary is equal to one weeks salary * 52
        double stateTax = salaryBeforeTax * stateTaxRate / 100; // in order to get the decimal result you divide by 100  to get state tax you multiply
        double federalTax = salaryBeforeTax * federalTaxRate / 100; //
        double totalTax = stateTax + federalTax;
        double salaryAfterTax = salaryBeforeTax - totalTax;

        System.out.println("Gross pay is: $ = " + salaryBeforeTax);


    }


}

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
					3.3 use print statement to print each of the above
				Ex:
					   hourlyRate = $50
					   weeklyHours = 45
					   stateTaxRate = 6 (given as percentage, you need to convert to decimal)
					   federalTaxRate = 26 (given as percentage, you need to convert to decimal)

				    output:
				    	Gross pay is: $117000
				    	Federal tax is: $30420
			    		State tax is: $7020
			    		Total tax is: $37440
			    		Net income is: 79560

     */