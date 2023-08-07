package day39_Recap.personTask;

public class Employee extends Person{

    private int employeeId;
    private String jobTitle;
    private double salary;

    // after variables unique to Employee are set => this constructor is created to avoid mess


    public Employee(String name, int age, char gender, int employeeId, String jobTitle, double salary) {
        super(name, age, gender); // super classes' instances called here by using "super()" shortcut
        /*
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
        this.salary = salary;
        ==> it is way better if we use setter to see if they match with our conditions because we already specificed the conditions in those methods
        */
        setEmployeeId(employeeId);
        setJobTitle(jobTitle);
        setSalary(salary);

    }


    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void work(){
        System.out.println(getJobTitle() + ", " + getName() + " is working.");
    }

    // to include employeeId, jobTitle and salary we have to create a toString method

    public String toString(){
        return
                "Name is: " + getName() + "\nAge is: " + getAge() + "\nGender is: " + getGender() +  "\nEmployee ID is: "
                        + employeeId + "\nJob Title is: " + jobTitle + "\nSalary is: $" + salary;
    }

}

/*
Create a subclass of Person named Employee:
            Extra variables:
                employeeId, jobTitle, salary

            Encapsulate all the fields

            Add a constructor to set all the fields

            Methods:
                work()
                toString()

 */