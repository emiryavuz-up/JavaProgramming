package aHomeTask.day39.restaurantTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Resturant {

    private String owner, location;
    private int numberOfStars;

    private ArrayList<Server> servers = new ArrayList<>();

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getNumberOfStars() {
        return numberOfStars;
    }

    public void setNumberOfStars(int numberOfStarts) {
        this.numberOfStars = numberOfStarts;
    }

    public ArrayList<Server> getServers() {
        return servers;
    }

    public void setServers(ArrayList<Server> servers) {
        this.servers = servers;
    }

    public Resturant(String owner, String location, int numberOfStars) {
        this.owner = owner;
        this.location = location;
        this.numberOfStars = numberOfStars;
    }

    public void hireServer(Server server){
        servers.add(server);
    }
    public void hireServers(Server[] servers){
        this.servers.addAll(Arrays.asList(servers));
    }
    public void terminateServer(int employeeID){
        servers.removeIf(p -> p.getEmployeeID() == employeeID);
    }

    public String toString() {
        return "Restaurant:" +
                "\nOwner = " + owner +
                "\nLocation = " + location +
                "\nNumber of Stars = " + numberOfStars +
                "\nNumber of Servers = " + servers.size();
    }



}
/*
Create a class called Restaurant

	            Attributes:
	                Owner (String), Location (String), numberOfStars (int)
	                Servers (ArrayList of Server objects)
	                Chefs (ArrayList of Chef objects)

                Add a constructor that sets the owner, location, and number of stars.

	            Actions: (all void methods)

	                hireServer(Server server): accepts a server object and adds it to the Servers ArrayList
	                hireServer(Server [] servers): accepts an array of Server objects and adds all of them to the Servers ArrayList

	                hireChef(Chef chef): accepts a chef object and adds it to the Chefs ArrayList
	                hireChef(Chef [] chefs): accepts an array of Chef objects and adds all of them to the Chef ArrayList

	                terminateChef(int employeeID): removes the chef with the matching ID from the arraylist of chef
	                terminateServer(int employeeID) removes the server with the matching ID from the arraylist of server

	                toString(): Return (String) of all the information of a Restaurant object. No need to pri
 */