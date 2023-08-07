package day37_Inheritance.scrumTask;

public class BusinessAnalyst extends Employee {
    // all Business Analysts same job title, therefore we do not give an argument to set it, we can set directly
    public BusinessAnalyst(String name, int age, char gender, int id, double salary, String companyName) {
        super(name, age, gender, "Business Analyst", id, salary, companyName);
    }

    public void analyse(){
        System.out.println(name + " is analysing the documents");
    }

}
