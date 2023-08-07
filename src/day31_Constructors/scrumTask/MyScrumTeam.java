package day31_Constructors.scrumTask;

public class MyScrumTeam {

    public static void main(String[] args) {

        // 3 testers objects

        // 4 developers object

        // once you have them we can create array of testers and developers

        // after that we will create 1 scrumTeam object, we will add those testers and developers into the arrayList of scrumTeam

        // 4 tester objects
        Tester tester1 = new Tester("Layan", 11, "QA", 110000);
        Tester tester2 = new Tester("Smynra", 43, "SDET", 142000);
        Tester tester3 = new Tester("Maya", 44, "SE", 135000);
        Tester tester4 = new Tester("Limon", 23, "SDET", 115000);


        Tester[] testers = {tester2, tester3, tester4}; // testers array is created to be added all together with addTesters method


        // 5 developers objects
        Developer developer1 = new Developer("Olga", 22, "Java Developer", 125000);
        Developer developer2 = new Developer("Jalal", 12, "Java Master", 185000);
        Developer developer3 = new Developer("Alex", 16, "Software Developer", 135000);
        Developer developer4 = new Developer("Emir", 25, "C## Developer", 125000);

        Developer[] developers = {developer2,developer3,developer4};

        // 1 ScrumTeam Object
        ScrumTeam scrum = new ScrumTeam("Nigara", "Huseyin", "Zalal", 14);
        scrum.addTester(tester1);
        scrum.addDeveloper(developer1);

        scrum.addTesters(testers); // this takes an array of testers, so we created testers array above
        scrum.addDevelopers(developers); // all the developers are added to scrum

        System.out.println(scrum);

        System.out.println("----------------------------------------------");

        for ( Tester eachTester : scrum.testersList ){ // in the scrum team we have testers arrayList which can be used with loop
            System.out.println(eachTester.name + " : " + eachTester.salary);
        }

        for (Developer eachDeveloper : scrum.devOpsList) { // iterate developers from the scrum team
            System.out.println(eachDeveloper.name + " : " + eachDeveloper.salary);
        }


        System.out.println("--------------------------------------------");

        scrum.removeTester(23);
        System.out.println(scrum); // limon is deleted

        scrum.removeDeveloper(22);
        System.out.println(scrum); // olga is deleted

    }

}
/*
create a class called MyScrumTeam:
	                    1. create an array of Testers and add the testers from your group
	                    2. create an array of developers and add the developers from your group
	                    3. create an object of ScrumTeam and store the testers & developers above to the scrum team
 */