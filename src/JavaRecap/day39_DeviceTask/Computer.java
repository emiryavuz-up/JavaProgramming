package JavaRecap.day39_DeviceTask;

public class Computer extends Device{
    public Computer(String brand, String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, hasBattery, hasPowerButton);
    }

    public void runsIntelliJ(){
        System.out.println(getBrand() + " " + getModel() + " is running IntelliJ for Java, Selenium practice.");
    }

}
/*
Create a subclass of Device named Computer:

				Add the extra methods if needed
 */