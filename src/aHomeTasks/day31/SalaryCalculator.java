    package aHomeTasks.day31;

    public class SalaryCalculator {

        public double hourlyRate;
        public double stateTaxRate;
        public double federalTaxRate;
        public double weeklyHours;

        public SalaryCalculator(double hourlyRate, double stateTaxRate, double federalTaxRate, double weeklyHours){

            this.hourlyRate = hourlyRate;
            this.stateTaxRate = stateTaxRate;
            this.federalTaxRate = federalTaxRate;
            this.weeklyHours = weeklyHours;

        }

        public double salary(){
            double salary = hourlyRate * weeklyHours * 52;
            return salary;
        }

        public double stateTax(){
           double stateTax = salary() * stateTaxRate;
           return stateTax;
        }

        public double federalTax(){
            double federalTax = salary() * federalTaxRate;
            return federalTax;
        }

        public double salaryAfterTax(){
            double totalTax = stateTax() + federalTax();
            double salaryAfterTax = salary() - totalTax;
            return salaryAfterTax;
        }


        public String toString() {
            return
                    "hourlyRate = $" + hourlyRate +
                    ", stateTaxRate = " + stateTaxRate +
                    ", weeklyHours = " + weeklyHours +
                    ", federalTaxRate = " + federalTaxRate +
                    ", salary = $" + salary() +
                    ", stateTax = $" + stateTax() +
                    ", federalTax $= " + federalTax() +
                    ", salaryAfterTax = $" + salaryAfterTax();

        }
    }
    /*
    1. SalaryCalculator Task:
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