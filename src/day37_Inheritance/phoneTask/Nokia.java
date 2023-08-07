package day37_Inheritance.phoneTask;

public class Nokia extends Phone{ // letting nokia extend phone class to use it's features
    // we set Nokia's own instances by calling super classes' constructor

    // we don't need the argument of brand => so we should not give it as parameter
    public Nokia(String model, String size, double price, String colour) {
        super("Nokia", model, size, price, colour);
    }
    public void selfDefense(){ // unique to Nokia class so it's created here instead of in the super class Phone
        System.out.println("You can use " + brand + " " + model + " as self defense tool");
    }

}
/*
Create a sub class of Phone named Nokia:
				Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					selfDefense()
					toString()
 */