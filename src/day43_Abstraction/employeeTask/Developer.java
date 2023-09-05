package day43_Abstraction.employeeTask;

public final class Developer extends Employee{ // because it's final, it can never be extended by another class

    public Developer(String name, int age, char gender, int ID, String jobTitle, double salary) {
        super(name, age, gender, ID, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is developing the application.");
    }


    @Override
    public void sleep() {
        System.out.println(getName() + " sleeps 2 hours per day.");
    }

    public void unitTest(){
        System.out.println(getName() + " is unit testing.");
    }


}
