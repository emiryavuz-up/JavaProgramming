package JavaRecap;

public class day31_SalaryCalculator {
        double hourlyRate;
        double stateTaxRate;
        double federalTaxRate;
        double weeklyHours;

        public void setInfo(double hourlyRate, double stateTaxRate, double federalTaxRate, double weeklyHours){

            this.hourlyRate = hourlyRate;
            this.stateTaxRate = stateTaxRate;
            this.federalTaxRate = federalTaxRate;
            this.weeklyHours = weeklyHours;

        }

        public void salary(){
            double salary = hourlyRate * weeklyHours * 52;
            System.out.println("Salary before tax: " + salary);
        }
        public void stateTax(){
            double totalStateTax = stateTaxRate * weeklyHours;
        }

        public String toString(){
            return "Hourly Rate: " + hourlyRate + "\nState Tax Rate: " + stateTaxRate
                    + "\nFederal Tax Rate: " + federalTaxRate + "\nWeekly Hours: " + weeklyHours;
        }


    public static void main(String[] args) {

            day31_SalaryCalculator sad = new day31_SalaryCalculator();
            sad.setInfo(5.5, 0.05, 0,16);
            System.out.println(sad);
            sad.salary();


    }


}

/*
SalaryCalculator Task:
		1.1 Create a class named Salary calculator:
		        Attributes:
		            hourlyRate, stateTaxRate, federalTaxRate, weeklyHours

	            Add a constructor to set all the fields

		        Actions:
		            salary(): calculates the salary ( hourlyRate * weeklyHour * 52)
		            stateTax(): calculates the totalStateTax
		            federalTax(): calculates the total federal tax
		            salaryAfterTax(): calculates the salary after tax
		            toString(): displays the salary, stateTax, federalTax, salaryAfterTax of the Object
 */