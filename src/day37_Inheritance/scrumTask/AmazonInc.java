package day37_Inheritance.scrumTask;

public class AmazonInc { // needs to have object of PO MA SM Testers Developers

    public static void main(String[] args) {

        String company = "Amazon Inc"; // we will pass this variable as companyName because it will be same for all the objects under this class
        ProductOwner productOwner = new ProductOwner("Smyrna", 29, 'F', 120, 160000, company);
        BusinessAnalyst businessAnalyst = new BusinessAnalyst("Limon", 59, 'F', 136, 150000, company);
        ScrumMaster scrumMaster = new ScrumMaster("Maya", 35, 'F', 52, 180000, company);
        Tester tester1 = new Tester("Limon", 23, 'M', "Automation Tester", 353, 200000, company);
        Tester tester2 = new Tester("Cigdem", 43, 'F', "SDET", 312, 200000, company);
        Tester tester3 = new Tester("Cipotle", 27, 'F', "Manual Tester", 367, 200000, company);
        Tester tester4 = new Tester("Karamel", 29, 'F', "Backend Tester", 369, 200000, company);
        Developer developer1 = new Developer("Jager", 43, 'M', "Java Developer",460, 170000, company);
        Developer developer2 = new Developer("Emir", 37, 'M', "Python Developer",490, 300000, company);
        Tester[] testers = {tester1,tester2,tester3,tester4};
        Developer[] developers = {developer1, developer2};

        ScrumTeam scrumTeam = new ScrumTeam(productOwner, businessAnalyst, scrumMaster);

        scrumTeam.addDeveloper(developer1);
        scrumTeam.addTesters(testers);
        scrumTeam.addDevelopers(developers);
        System.out.println(scrumTeam);

        System.out.println("------------------------");

        // displays every single person's name and salary from the scrum team
        for (Tester tester : scrumTeam.testers) {
            System.out.println(tester.name + " : " + tester.salary);
        }

        System.out.println("-------------------");

        for (Developer developer : scrumTeam.developers) {
            System.out.println(developer.name + " : " + developer.salary);
        }

        System.out.println("----------------");
        System.out.println(productOwner);
        System.out.println(businessAnalyst);
        System.out.println(scrumMaster);
        System.out.println(tester1);
        System.out.println(tester2);
        System.out.println(tester3);
        System.out.println(developer1);
        System.out.println(developer2);

        System.out.println("-----------------");

        productOwner.work();
        tester2.onBreak();

    }

}
