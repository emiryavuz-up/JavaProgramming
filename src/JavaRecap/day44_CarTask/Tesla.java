package JavaRecap.day44_CarTask;

public class Tesla extends Car implements AutoPark, AutoPilot{
    public Tesla(String make, String model, int year, double price, String colour) {
        super(make, model, year, price, colour);
    }

    @Override
    void start() {
        System.out.println(getModel() + " is started by saying \"Start\"");
    }

    @Override
    void drive() {
        System.out.println(getModel() + " is driving itself in a smart way.");
    }

    @Override
    public void autoPark() {
        System.out.println(getModel() + "'s auto park is enabled.");
    }
    @Override
    public void selfDrive(){
        System.out.println(getModel() + "'s auto pilot feature enabled.");
    }

}

