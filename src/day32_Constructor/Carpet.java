package day32_Constructor;

public class Carpet {

    public double width, length, unitPrice;
    public boolean isPersian;

    // instances will be set soon as they are used in objects with  separate memories
    // public Carpet(){} = is a default constructor
    public Carpet(double width, double length, double unitPrice, boolean isPersian){ // // constructor name has to be the same as class name
            this.width = width;
            this.length = length;
            this.unitPrice = unitPrice;
            this.isPersian = isPersian;
            // each of these instances can be assigned to a different argument
    } // public Class (){}


    public double calcCost(){
        double totalPrice = (width*length) * unitPrice;
        if(isPersian){ // if isPersian is true
            totalPrice += 200;
        }
        return totalPrice;
    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice= $" + unitPrice +
                ", isPersian=" + isPersian +
                ", totalPrice $=" + calcCost() +
                '}';
    }


}
/*
warmup task:
	1.Carpet Task:
		1.1 create a custom class for the Carpet class that should contain the following:
                Attributes:
                        width, length, unitPrice, isPersian (boolean)

				Add a constructor to set all the instances

                Actions:
                    calcCost(): should be able to calculate the total cost of the carpet and return it as double
                    toString(): should be able to display all the info of the carpet including the total cost of the carpet as calculated by calcCost()

            total price of carpet = (width*length) * unitprice

            if the carpet is Persian  carpet, add 200$ to the totalPrice

 */