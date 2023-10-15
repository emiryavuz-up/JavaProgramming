package JavaRecap.day37_EmployeeTask;

public class PersonObject {

    public static void main(String[] args) {

        Tester tester = new Tester("Smyrna", "SDET", "1491S", 'F', 400000);
        System.out.println(tester);
        tester.test();
        tester.work();

    }

}
