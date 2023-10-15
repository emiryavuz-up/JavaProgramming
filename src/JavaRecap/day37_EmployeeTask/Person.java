package JavaRecap.day37_EmployeeTask;

public class Person {

    private String name, jobTitle, id;
    private char gender;
    private double salary;

    public Person(String name, String jobTitle, String id, char gender, double salary) {
        setName(name);
        setJobTitle(jobTitle);
        setId(id);
        setGender(gender);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            System.out.println("Name can not be empty");
            System.exit(1);
        }
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void work() {
        System.out.println(name + " is working");
    }

    @Override
    public String toString() {
        return "Person:" +
                "\nName = " + name +
                "\nJobTitle = " + jobTitle +
                "\nID = " + id +
                "\nGender = " + gender +
                "\nSalary = $" + salary;
    }

}
/*
EmployeeTask


	Employee extends Person:
		name, age, id, gender, jobTitle, salary
		work(), toString()


	Tester extends Employee
			creatingTicket()
 */
