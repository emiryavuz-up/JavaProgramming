package day37_Inheritance.scrumTask;

public class ScrumMaster extends Employee { // ScrumMaster is an employee // is a relation
    // all scrum masters they do not different job title, therefore we do not give an argument to set it, we can set directly
    public ScrumMaster(String name, int age, char gender, int id, double salary, String companyName) {
        super(name, age, gender, "Scrum Master", id, salary, companyName);
    }

    public void arrangeMeeting(){
        System.out.println(jobTitle + " " + name + " has arranged a meeting.");
    }


}
