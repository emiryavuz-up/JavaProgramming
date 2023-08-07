package day35_Encapsulation;

public class Employee {

    private String name;
    private char gender;
    private int age;
    private double salary;

    public String getName(){
        return name;
    }

    public char getGender(){
        return gender;
    }

    public int getAge(){
        return age;
    }

    public double getSalary(){
        return salary;
    }

    public Employee(String name, char gender, int age, double salary) {
        setName(name);
        setGender(gender);
        setAge(age);
        setSalary(salary);
    }

    // now setters

    public void setAge(int age){
        if(age < 16 || age > 90){
            return;
        }
        this.age = age;
    }

    public void setName(String name){
        if(name.isEmpty()){
            return; // exits the method
        }
        this.name = name;
    }

    public void setGender(char gender) {
        if(  !(gender == 'M' || gender == 'F')  ){
            return;
        }
        this.gender = gender;
    }

    public void setSalary(double salary){
        if(salary <= 0){
            return;
        }
        this.salary = salary;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", salary per month $=" + salary +
                '}';
    }
}