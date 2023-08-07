package day39_Recap.personTask;

public class Tester extends Employee{ // Tester is richer because it's extended by Employee

    // as long as it's Employee below variables need to be set ==> mandatory!!
    // so we called the super classes' constructor and provided arguments to be set
    public Tester(String name, int age, char gender, int employeeId, String jobTitle, double salary) {
        super(name, age, gender, employeeId, jobTitle, salary);
    }

    public void createTicket(){
        System.out.println(getJobTitle() + ", " + getName() + " is creating a ticket.");
    }

    @Override
    public void work() {
        System.out.println(getJobTitle() + ", " + getName() + " is finding bugs and testing the application.");
    }
}

/*
Create a sub class of Employee named Tester

            Override the work method

            Extra methods:
                createTicket()
 */
