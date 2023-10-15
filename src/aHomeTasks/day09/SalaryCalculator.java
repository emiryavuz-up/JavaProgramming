package aHomeTasks.day09;

public class SalaryCalculator {

    public static void main(String[] args) {

        /*
        Write a program that can calculate the salary after tax based on the following requirements
                the tax rates are:
                        35% for salary of 130K or more
      			30% for salary of 100K to 130k (excluded)
      			25% for salary of 80K to 100K (excluded)
      			20% for salary less than 80K

                in addition, if the person is married, he/she will pay 5% less tax
         */


        double salary = 75.000;
        double taxRate = 0; // this is 0 because it will be calculated below anyway as 0.35, 0.25...
        boolean isMarried = true;


        if (salary >= 130.000) {
            taxRate = 0.35; //35%
        } else if (salary >= 100.000 && salary <= 129.000) {
            taxRate = 0.30; //30%
        } else if (salary >= 80.000 && salary <= 99.999) {
            taxRate = 0.25; //25%
        } else if (salary < 80.000) {
            taxRate = 0.20; //20%
        }

        if (isMarried) { // after the salary is calculated it will be reduced by 5 percent
            taxRate -= 0.05; // SUBSTRACTING 5% FROM THE ORIGINAL TAX RATE
        }

        double salaryAfterTax = salary - (salary * taxRate); //

        System.out.println("salaryAfterTax = " + salaryAfterTax);
    }


    }

