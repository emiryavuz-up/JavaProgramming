package day30_CustomClass;

public class EmployeeCapitalOne {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        Employee employee4 = new Employee();
        Employee employee5 = new Employee();

        employee1.setInfo("John", 'M', 25, 2237, "Developer", 100000, true);
        employee2.setInfo("Anna", 'F', 28, 2287, "QA", 85000, true);
        employee3.setInfo("David", 'M', 35, 2256, "QA", 45000, false);
        employee4.setInfo("Line", 'F', 45, 2290, "Manager", 80000, true);
        employee5.setInfo("Kevin", 'M', 35, 2298, "Senior QA", 110000, true);

        Employee[] employees = { employee1, employee2, employee3, employee4, employee5};

        int countFullTime = 0;
        int countPartTime = 0;

        double max = employees[0].salary;
    // if there is one employee who makes more than the first employee we will update the result with that salary to find min/max
        double min = employees[0].salary;

        for (Employee each : employees) {

            if(each.isFullTime){
                countFullTime++;
            }else{
                countPartTime++;
            }

            if(each.salary > max){
                max = each.salary;
            }

            if(each.salary < min){
                min = each.salary;
            }

        }

        System.out.println("countPartTime = " + countPartTime);
        System.out.println("countFullTime = " + countFullTime);
        System.out.println("max = " + max);
        System.out.println("min = " + min);


    }
}
