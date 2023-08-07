package day37_Inheritance.phoneTask;

public class iPhone extends Phone{

    // iPhone has instances => we use constructor to set it, but all iPhones have Apple as brand that's why it is not given as parameter
    // but set directly // brand will always be set to "Apple"
    public iPhone(String model, String size, double price, String colour) { // when you create the object you give one less parameter
        // one extra argument disadvantage is
        // everytime iPhone is used you will always need to pass one more information even though it's the same for all iPhones
    super("Apple", model, size, price, colour); // which can be set like this to make it more efficient // value has been "hard-coded"
    } // the moment you add the constructor to super class it's mandatory to call the constructor manually
     // phone has 5 instances => we also need to pass 5 parameters
    //  so use the shortcut, and it generates you the iPhone constructor which allows you to set all the instances of super class Phone
    //  we can manually add things that super class does not have but this class should have such as FaceTime which isn't exclusive to Phone(Super class)
    //  facetime is unique to iPhone not all the phones, so it's added manually
    //  sub class can have it's own fields and methods

    public void faceTime(long phoneNumber){
        System.out.println(brand + " " + model + " " + " is having a FaceTime with " + phoneNumber);
    } // faceTime method which is unique to iPhone created here

    //method overloading occured here by giving a different parameter
    public void faceTime(String email){
        System.out.println(brand + " " + model + " " + " is having a FaceTime with " + email);
    }


}

/*
2 Create a sub class of Phone named IPhone:
				Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					faceTime(long phoneNumber)
					faceTime(String email)
					toString()
 */