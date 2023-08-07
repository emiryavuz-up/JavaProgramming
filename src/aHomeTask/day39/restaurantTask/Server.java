package aHomeTask.day39.restaurantTask;

public class Server {

    private String name;
    private int employeeID;
    private double hourlyRate;
    private boolean fullTime;

    public String getName(){
        return name;
    }

    public int getEmployeeID(){
        return employeeID;
    }

    public double getHourlyRate(){
        return hourlyRate;
    }
    public boolean isFullTime(){
        return fullTime;
    }

    public void setName(String name){
        if(name.isBlank() || name.isEmpty()){
            System.err.println("Invalid name: " + name);
            System.exit(1);
        }
        this.name = name;
    }

    public void setEmployeeID(int employeeID){
        if(employeeID <= 0){
            System.err.println("Invalid ID: " + employeeID);
            System.exit(1);
        }
        this.employeeID = employeeID;
    }

    public void setHourlyRate(double hourlyRate){
        this.hourlyRate = hourlyRate;
    }
    public void setFullTime(boolean fullTime){
        this.fullTime = fullTime;
    }

    public Server(String name, int employeeID, double hourlyRate, boolean fullTime){
        setName(name);
        setEmployeeID(employeeID);
        setHourlyRate(hourlyRate);
        setFullTime(fullTime);
    }

    public void takeOrder(){
        System.out.println(name + " is taking an order.");
    }
    public void cleanTable(){
        System.out.println(name + " is cleaning the table.");
    }

    public String toString() {
        String fullTimeStatus = fullTime? "Full time" : "Part Time";
        return "Server:" +
                "\nName = " + name +
                "\nEmployee ID = " + employeeID +
                "\nHourly Rate = " + hourlyRate +
                "\nFull Time Status = " + fullTimeStatus;
    }
}

/*
6. Restaurant Task:
		6.1  Create a class called Server

	        Attributes:
	                name (String), employeeID (int), hourlyRate (double), fullTime (boolean)

Add A constructor that can set all the fields

	        Actions: (all void methods)
	            takeOrder(): server's name + "is taking an order"
	            cleanTable(): server's name + "is cleaning the table"
	            toString(): Returns (String) all the information of a Server
	                -> Extra: For fullTime status, instead of printing a boolean value, print "full-time" or "part-time"

		6.2 Create a class called Chef

		            Attributes:
		                name (String), employeeID (int), hourlyRate (double), fullTime (boolean)

			   Add A constructor that can set all the fields

		            Actions: (all void methods)
		                makeOrder(): chef's name + "is making an order"
		                washDishes(): chef's name + "is washing the dishes"
		                toString(): Returns (String) all the information of a Chef
		                    -> Extra: For fullTime status, instead of printing a boolean value, print "full-time" or "part-time"

		6.3 Create a class called Restaurant

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

	                toString(): Return (String) of all the information of a Restaurant object. No need to print the whole list of Servers or Chefs. Print the number of Servers and Chefs along side the other information


		6.4. Create a class LocalRestaurant that has a main method with the following:
	        	- Make a Restaurant object
	        	- Create an array of servers with their information set. Add those initial servers to the ArrayList of Servers in the Restaurant object
	            - Create an array of chefs with their information set. Add those initial chefs to the ArrayList of Chefs in the Restaurant object

	            - Print your whole restaurants information
 */