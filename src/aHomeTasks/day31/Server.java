package aHomeTasks.day31;

public class Server {

    public String name;
    public int employeeID;
    public double hourlyRate;
    public boolean fullTime;

    public Server(String name, int employeeID, double hourlyRate, boolean fullTime){

        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.fullTime = fullTime;

    }

    public void takeOrder(){
        System.out.println(name + " is taking an order");
    }
    public void cleanTable(){
        System.out.println(name + " is cleaning the table");
    }
    public String toString(){
        if(fullTime == true){
            System.out.println("Full-time");
        }else if(fullTime == false){
            System.out.println("Part-time");
        }
        return "Name of the server: " + name + "\nEmployee ID: " + employeeID + "\nHourly Rate: $" + hourlyRate;

    }
}

/*
6.1  Create a class called Server

	        Attributes:
	                name (String), employeeID (int), hourlyRate (double), fullTime (boolean)

Add A constructor that can set all the fields

	        Actions: (all void methods)
	            takeOrder(): server's name + "is taking an order"
	            cleanTable(): server's name + "is cleaning the table"
	            toString(): Returns (String) all the information of a Server
	                -> Extra: For fullTime status, instead of printing a boolean value, print "full-time" or "part-time"
 */