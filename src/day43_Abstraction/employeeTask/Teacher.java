package day43_Abstraction.employeeTask;

public final class Teacher extends Employee{ // this class can not be extended because it's final
    public Teacher(String name, int age, char gender, int ID, String jobTitle, double salary) {
        super(name, age, gender, ID, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is teaching.");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " sleeps 10 hours a day.");
    }


}
