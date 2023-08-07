package day39_Recap.personTask;

public class Teacher extends Employee{

    public Teacher(String name, int age, char gender, int employeeId, String jobTitle, double salary) {
        super(name, age, gender, employeeId, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle() + ", " + getName() + " is teaching.");
    }
}

/*
 Create a subclass of Employee named Teacher

            Override the work method
 */