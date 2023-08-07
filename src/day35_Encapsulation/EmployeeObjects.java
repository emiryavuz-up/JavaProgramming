package day35_Encapsulation;

public class EmployeeObjects {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Smyrna", 'Q', -100, -200.500);

        System.out.println(employee1);

        employee1.setAge(27);
        employee1.setName("Leika");
        employee1.setSalary(23500);

        System.out.println(employee1.getName() + " : " + employee1.getAge() + " : " + "$"+ employee1.getSalary());

        employee1.setSalary(employee1.getSalary() + 1500); // is also possible
        System.out.println(employee1.getSalary());

    }

}
