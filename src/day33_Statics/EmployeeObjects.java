package day33_Statics;

public class EmployeeObjects {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.name = "Limon";
        employee1.salary = 110000;

        Employee employee2 = new Employee();
        employee2.name = "Smyrna";
        employee2.salary = 115000;

        Employee employee3 = new Employee();
        employee3.name = "Maya";
        employee3.salary = 120000;

        System.out.println(employee1.name + " : " + employee1.salary);
        System.out.println(employee2.name + " : " + employee2.salary);
        System.out.println(employee3.name + " : " + employee3.salary);


        // because of static salary is the last one for all as it can only have one copy

        System.out.println(employee1.isHuman);
        System.out.println(employee2.isHuman);
        System.out.println(employee3.isHuman);
        // same for every single object of the employee because it's static in the class and not instance

    }
}
