package day37_Inheritance.scrumTask;

public class ProductOwner extends Employee {// is an employee so needs to have all the attributes of Employee

    // there is only one job title so we set it directly instead of giving as parameter to avoid passing it every single time when we create a product owner
    public ProductOwner(String name, int age, char gender,int id, double salary, String companyName) {
        super(name, age, gender, "Product Owner", id, salary, companyName);

    }

}
