package JavaRecap;

public class day33_iPhone {

    public String model, colour, size;
    public double price;

    static String brand = "iPhone";
    static String OS = "MacOS";
    static String madeIn = "United States";

    public day33_iPhone(String model, double price, String colour, String size) {

        this.model = model;
        this.colour = colour;
        this.size = size;
        this.price = price;
    }

    public void faceTime(long phoneNumber){
        System.out.println(model + " is calling " + phoneNumber);
    }
    public void faceTime(String email){
        System.out.println(model + " has sent a mail to " + email);
    }

    @Override
    public String toString() {
        return "Day33_iPhone:" +
                "\nBrand: " + brand +
                "\nOperating System: " + OS +
                "\nMade in: " + madeIn +
                "\nModel: " + model +
                "\nColor: " + colour +
                "\nSize: " + size +
                "\nPrice: " + price;
    }

    public static void main(String[] args) {

        day33_iPhone iPhone = new day33_iPhone("14 Pro Max", 400, "White", "40.5cm");
        System.out.println(iPhone);
        iPhone.faceTime(231213556);
        iPhone.faceTime("somemail@gmail.com");
        String str = day33_iPhone.OS = "String";
        System.out.println(str);

    }


}
/*
iPhone Task:
		1. Create a class named iPhone:

				Attributes:
					instance: model, price, color, size
					statics: brand, OS, madeIn

				Add a constructor that can set All the fields (instances)

				Actions:
					faceTime(long phoneNumber)
					faceTime(String email)
					call(long phoneNumber)
					text(long phoneNumber)
					toString()
 */
