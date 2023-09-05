package day43_Abstraction.employeeTask;

public final class Tester extends Employee{ // non-abstract subclass has to override the abstract method of it's super classes'


    public Tester(String name, int age, char gender, int ID, String jobTitle, double salary) {
        super(name, age, gender, ID, jobTitle, salary);
    }

    // 2 below methods have to be overridden in this subclass because they are abstract
    @Override
    public void work() {
        System.out.println(getName() + " is testing the application.");

    }

    @Override
    public void sleep() {
        System.out.println(getName() + " sleeps 1 hour per day.");
    }

    // this method will never be inherited because the class is final
    public final void bugReport(){
        System.out.println(getName() + " is creating bug reports.");
    }


}
