package day43_Abstraction.employeeTask;

public final class Driver extends Employee{
    public Driver(String name, int age, char gender, int ID, String jobTitle, double salary) {
        super(name, age, gender, ID, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is driving.");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " sleeps 12 hours a day.");
    }



}
