package day31_Constructors;

public class Offer {

        public String location; // instance variable is created to to create multiple objects
        public String companyName; // each object can have separate copy with instances
        public String jobTitle; // an instance is created, we will be able to store different information for each of the objects

        public double salary; // to set the attributes separately we use this instance
        public boolean hasBenefit; // 10 different objects, 10 separate copies of this will be created
        public boolean hasPTO; // PTO: paid time off
        public boolean isWFH; // work from home
        public boolean isFulltime;

     //  public boolean hasBenefit, hasPTO, isWFH, isFulltime can be also used

    //attributes are information of the objects to use them differently and create different copies we use setInfo to set the instances above


    // to set the instance variables using the method parameters

    // for every object we will able to create a new copy
    public void setInfo(String location, String companyName, String jobTitle, double salary, boolean hasBenefit, boolean hasPTO, boolean isWFH, boolean isFulltime) {
        this.location = location; // instance variables will help us set them like this that's why they are created above
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.hasBenefit = hasBenefit;
        this.hasPTO = hasPTO;
        this.isWFH = isWFH;
        this.isFulltime = isFulltime;
    }

    // to avoid getting hashCode we generate toString method


    public String toString() {
        return "Offer\n" +
                "location='" + location + '\'' +
                ", companyName='" + companyName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salaryPerMonth= $" + salary +
                ", hasBenefit=" + hasBenefit +
                ", hasPTO=" + hasPTO +
                ", isWFH=" + isWFH +
                ", isFulltime=" + isFulltime;

    }

}


/*
        Offer Task:
		        Create a custom class named Offer
				Attributes: // we need different copies of these
						location, companyName, jobTitle, salary, hasBenefit, hasPTO, isWFH, isFullTime

				Actions:
					setInfo(): sets all the instance variables
					toString(): returns the full info of the Offer Object
 */