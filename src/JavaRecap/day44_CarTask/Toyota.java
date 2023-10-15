package JavaRecap.day44_CarTask;

public class Toyota extends Car{
    public Toyota(String make, String model, int year, double price, String colour) {
        super(make, model, year, price, colour);
    }

    @Override
    void start() {
        System.out.println(getModel() + " is started by turning on the ignition key");
    }

    @Override
    void drive() {
        System.out.println(getModel() + " is being driven by a person");
    }

}
