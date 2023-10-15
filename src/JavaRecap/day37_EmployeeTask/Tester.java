package JavaRecap.day37_EmployeeTask;

public class Tester extends Person{
    public Tester(String name, String jobTitle, String id, char gender, double salary) {
        super(name, jobTitle, id, gender, salary);
    }

    public void test(){
        System.out.println(getName() + " is testing the codes by using Selenium.");
    }

}
