package JavaRecap.day36_PhoneTask;

public class iPhone extends  Phone{
    public iPhone(String model, String size, String colour, double price) {
        super("iPhone", model, size, colour, price);
    }
    public void faceTime(long phoneNumber){
        System.out.println(getBrand() + " is facetiming: " + phoneNumber);
    }


}
/*
Create a sub class of Phone named IPhone:
				Variables:
					brand, model, size, price, color

				Methods:
					call(long phoneNumber)
					text(long phoneNumber)
					faceTime(long phoneNumber)
					faceTime(String email)
					toString()
 */