package aHomeTask.day36.PhoneTask;

public class Phone {

    public String brand, model, size, colour;
    public double price;

    public void setInfo(String brand, String model, String size, String colour, double price){
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.colour = colour;
        this.price = price;
    }

    public void call(long phoneNumber){
        System.out.println(model + " is calling this number: " + phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println(model + " is texting this number: " + phoneNumber);
    }
    public String toString(){
        return
                "Brand is: " + brand + "\nModel is: " + model + "\nSize is: " + size +
                        "\nPrice is: $" + price + "\nColour is: " + colour;
    }
}
/*
1. Phone Task:
		1.1 Create a class named Phone:
				Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					toString()
 */