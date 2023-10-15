package aHomeTasks.day40.scrumTeam;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    private ProductOwner PO;
    private BusinessAnalyst BA;
    private ScrumMaster SM;

    private ArrayList<Tester> testers = new ArrayList<>();
    private ArrayList<Developer> developers = new ArrayList<>();

    public ProductOwner getPO() {
        return PO;
    }

    public void setPO(ProductOwner PO) {
        this.PO = PO;
    }

    public BusinessAnalyst getBA() {
        return BA;
    }

    public void setBA(BusinessAnalyst BA) {
        this.BA = BA;
    }

    public ScrumMaster getSM() {
        return SM;
    }

    public void setSM(ScrumMaster SM) {
        this.SM = SM;
    }

    public ArrayList<Tester> getTesters() {
        return new ArrayList<>(testers); // Return a copy of the testers list
    }

    public ArrayList<Developer> getDevelopers() {
        return new ArrayList<>(developers); // Return a copy of the developers list
    }

    public void addTester(Tester tester){
        testers.add(tester);
    }
    public void addTesters(Tester[] testers){
        this.testers.addAll(Arrays.asList(testers));
    }
    public void removeTester(Tester tester){
        testers.remove(tester);
    }
    public void addDeveloper(Developer developer){
        developers.add(developer);
    }
    public void addDevelopers(Developer[] developers){
        this.developers.addAll(Arrays.asList(developers));
    }
    public void removeDeveloper(Developer developer){
        developers.remove(developer);
    }

    @Override
    public String toString() {
        return "Scrum Team:" +
                "\nPO: " + PO +
                "\nBA: " + BA +
                "\nSM: " + SM +
                "\nTesters: " + testers +
                "\nDevelopers:  " + developers +
                "\nNumber of Testers: " + testers.size()+
                "\nNumber of Developers: " + developers.size();
    }



}
/*
Create a class named ScrumTeam:
			Variables:
				PO (ProductOwner), BA (BusinessAnalyst), SM (ScrumMaster),
				testers (ArrayList<Testers>),  developers (ArrayList<Developers>)

			Methods:
				addTester(Tester tester): adds the given tester to testers arraylist

				AddTesters(Tester[] testers): adds the given testers to testers arraylist

				removeTester(int id): removes the tester with the given id from the arraylist of tester

				addDeveloper(Developer developer): adds the given developer to testers arraylist

				addDeveloper(Developer[] developer): adds the given developers to testers arraylist

				removeDeveloper(int id): removes the developer with the given id from the arraylist of developer

				toString(): displays the BA name, SM name, PO name, number of testers and number of developers

 */
