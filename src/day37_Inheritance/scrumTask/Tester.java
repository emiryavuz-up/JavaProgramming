package day37_Inheritance.scrumTask;

// being the child of the Employee makes this class richer
public class Tester extends Employee {  // Tester is both Employee and Person
    // Tester may have different job titles!! therefore it's given as parameter to be set accordingly
    public Tester(String name, int age, char gender, String jobTitle, int id, double salary, String companyName) {
        super(name, age, gender, jobTitle, id, salary, companyName);
    }

    // method unique to Tester is added manually here
    public void createTicket(){
        System.out.println(jobTitle + " " + name + " is creating ticket.");
    }


}
