package day32_Constructor;

public class EmployeeObjects {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Limon"); // object of the employee, attribute of name is set

        Employee employee2 = new Employee("Umfufu", 'F');

        Employee employee3 = new Employee("Maya", 'F', "Part time dog");

        Employee employee4 = new Employee("Smyrna", 'F', "Full Time Dog", 5);


        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println(employee4);

    }
}
