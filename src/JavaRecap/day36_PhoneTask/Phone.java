package JavaRecap.day36_PhoneTask;

public class Phone {

    private String brand, model, size, colour;
    private double price;

    public Phone(String brand, String model, String size, String colour, double price) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.colour = colour;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void call(long phoneNumber){
        System.out.println(model + " is calling: " + phoneNumber);
    }
    public void text(long phoneNumber){
        System.out.println(model + " is calling: " + phoneNumber);
    }
    public String toString(){
        return (getClass()) +
        "\nBrand: " + brand +
        "\nModel: " + model +
        "\nSize: " + size +
        "\nColour: " + colour +
        "\nPrice: " + price;
    }

}
/*
Phone Task:
		1.1 Create a class named Phone:
				Variables:
					brand, model, size, price, color

				Methods:
					call(long phoneNumber)
					text(long phoneNumber)
					toString()
 */

