package day43_Abstraction.car;

// final class can not be inherited
public final class Tesla extends Car{ // Mandatory: child class has to override the abstract method

    // Mandatory: Constructor with parameters has to be called explicitly in this class
    public Tesla(String brand, String model, String color, int year, double price) {
        super("Tesla", model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Say \"Start\" to start.");
    }

    // final keyword is not given because the class is final. this class can never have subclass
    // so, this method can not be inherited anyway
    public void autoPilot(){
        System.out.println(getBrand() + " " + getModel() + " has auto pilot enabled");

    }


}
