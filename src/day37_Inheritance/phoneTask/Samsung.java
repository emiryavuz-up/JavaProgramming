package day37_Inheritance.phoneTask;

public final class Samsung extends Phone {
    // constructor of samsung class added to use super class' constructor => otherwise we get compiler error because there isn't default constructor => so we need to set it manually
    public Samsung(String model, String size, double price, String colour) {
        super("Samsung", model, size, price, colour);
    }

    public void freeze(){
        System.out.println(brand + " " + model + " is freezing");
    }


}
/*
Create a sub class of Phone named Samsung:
				Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					freeze()
					toString()
 */