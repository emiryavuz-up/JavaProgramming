package day32_Constructor;

public class Employee {

    public String name;
    public char gender;
    public String jobTitle;
    public double salary;

    public Employee(String name){
        this.name = name;
    }

    public Employee(String name, char gender){ // this constructor calls the above constructor
        this(name); // set the name of the employee // this.name = name; // because we already have a function above
        this.gender = gender;
    }

    public Employee(String name, char gender, String jobTitle){
        this(name, gender); // calling the constructors above by their name by using this() keyword
        //this.gender = gender;
        this.jobTitle = jobTitle;
    }

    public Employee(String name, char gender, String jobTitle, double salary){
        this(name, gender, jobTitle);
        this.salary = salary;
    }

    public void method1(){

    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }

    /*
    public void method1(){
        System.out.println("Method1");
    }
public void method2(){
        method1();
}
*/

}
