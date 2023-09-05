package day43_Abstraction.car;

public final class Audi extends Car{ // final prevents the class from being inherited
    public Audi(String brand, String model, String color, int year, double price) {
        super("Audi", model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Push the start button.");
    }

    public void autoPark(){
        System.out.println(getBrand() + " " + getModel() + " has auto park enabled.");
    }


}
