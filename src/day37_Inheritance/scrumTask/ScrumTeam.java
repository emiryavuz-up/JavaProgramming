package day37_Inheritance.scrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam { // every single Scrum Team has PO BA AND SM

    public ProductOwner PO;
    public BusinessAnalyst BA;
    public ScrumMaster SM;

    // there are multiple tester and developers
    // arrayList helps to add and remove to testers and developers because size is dynamic
    public ArrayList<Tester> testers = new ArrayList<>();
    public ArrayList<Developer> developers = new ArrayList<>();

    public ScrumTeam(ProductOwner PO, BusinessAnalyst BA, ScrumMaster SM){ // constructor is created for ScrumTeam
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
    }

    // takes one tester and adds them to the arraylist of testers
    // just adding without returning any data we can create void method
    public void addTester(Tester tester){ // adds one tester into the arraylist of testers therefore => Tester tester object is given
        testers.add(tester);
    }

    //takes one array of testers and adds them to arraylist of testers
    public void addTesters(Tester[] testers){ // local variable have the same name as the instance, so we use this keyword
        this.testers.addAll(Arrays.asList(testers));
    }

    //removes any specific object by ID because it's the only thing can be completely unique
    //takes id and removes that tester from the arraylist of testers
    public void removeTester(int id){
        testers.removeIf(p -> p.id == id); // p: each of the tester in the arrayList => if it matches with the given id it will be removed
    }

    //takes one developer object and adds to arraylist of developers
    public void addDeveloper(Developer developer){ // add given developer object to arrayList of developers
        developers.add(developer);
    }

    //takes one array of developers and adds them to arraylist of developers
    public void addDevelopers(Developer[] developers){
        this.developers.addAll(Arrays.asList(developers));
    }

    //takes one id and removes that developer from the arraylist of developers
    public void removeDeveloper(int id){
        developers.removeIf(p -> p.id == id);
    }

    public String toString() { // we modified the toString method as we wanted
        return "ScrumTeam\n" +
                "PO = " + PO.name + // every PO has a name
                ", BA = " + BA.name + // every BA has a name
                ", SM = " + SM.name + // every SM has a name
                ", testers = " + testers +
                ", number of testers = " + testers.size() +
                ", developers = " + developers +
                ", number of developers = " + developers.size();
    }
}
