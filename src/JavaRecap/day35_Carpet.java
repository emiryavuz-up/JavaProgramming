package JavaRecap;

public class day35_Carpet {

    private double width;
    private double length;
    private double unitPrice;
    private boolean isPersian;

    public day35_Carpet(double width, double length, double unitPrice, boolean isPersian){
        setWidth(width);
        setLength(length);
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    public double getWidth(){
        return width;
    }
    public double getLength(){
        return length;
    }
    public double getUnitPrice(){
        return unitPrice;
    }

    public boolean isPersian() {
        return isPersian;
    }

    public void setWidth(double width){
        if(width < 0){
            System.exit(1);
        }
        this.width = width;
    }
    public void setLength(double length){
        if(length < 0){
            System.exit(1);
        }
        this.length = length;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setPersian(boolean persian) {
        isPersian = persian;
    }

    public double calcCost(){
        double totalPrice = (width * length) * unitPrice;
        if(isPersian){
            totalPrice += 200;
        }
        return totalPrice;
    }

    @Override
    public String toString() {
        return "day35_Carpet" +
                "\nWidth = " + width +
                "\nLength = " + length +
                "\nUnit Price = $" + unitPrice +
                "\nIs Persian = " + isPersian;
    }

    public static void main(String[] args) {

        day35_Carpet carpetObj = new day35_Carpet(40.5, 50.5, 39.99, true);
        System.out.println(carpetObj);
        double totalPrice = carpetObj.calcCost();
        System.out.println("Total price is: $" + totalPrice);

    }
}

/*
Carpet Task
		3.1 Create a class named Carpet:
                private variables:
                        width, length, unitPrice, isPersian (boolean)

                Encapsulate all the fields:
                		Conditions:
                			width can not be negative
                			width can not be negative
                			unit price can not be negative

		Add a constructor to set all the instances
                instance methods:
                        calcCost(): should be able to calculate the total cost of the carpet and return it as double
                        toString(): should be able to display all the info of the carpet including the total cost of the carpet as calculated by calcCost()
            total price of carpet = (width*length)*unitPrice
            if the carpet is persian  carpet, add 200$ to the totalPrice
 */