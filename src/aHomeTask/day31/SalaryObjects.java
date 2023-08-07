package aHomeTask.day31;

public class SalaryObjects {

    public static void main(String[] args) {

        SalaryCalculator salaryCalculator = new SalaryCalculator(40,0.03, 0.05, 50);

        double salary = salaryCalculator.salary();
        double stateTax = salaryCalculator.stateTax();
        double federalTax = salaryCalculator.federalTax();
        double salaryAfter = salaryCalculator.salaryAfterTax();

        System.out.println(salaryCalculator);

        System.out.println(salary);
        System.out.println(stateTax);
        System.out.println(federalTax);
        System.out.println(salaryAfter);

    }
}
