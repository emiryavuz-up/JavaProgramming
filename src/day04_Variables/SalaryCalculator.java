package day04_Variables;

public class SalaryCalculator {


    public static void main(String[] args) {

        // hourlyRates, weeklyHours

        int hourlyRates = 50;
        int weeklyHours = 40;
        int numberOfWeeks = 52;

        int salary = hourlyRates * weeklyHours * numberOfWeeks; //you have 52 weeks in a year! that's why

        // System.out.println(salary); this is to print out so instead use "SOUTV"

        System.out.println("hourlyRates = $" + hourlyRates);
        System.out.println("weeklyHours = $" + weeklyHours);
        System.out.println("numberOfWeeks = $" + numberOfWeeks);
        System.out.println("salary = $" + salary);



    }


}
