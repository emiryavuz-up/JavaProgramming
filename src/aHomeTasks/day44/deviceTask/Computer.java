package aHomeTasks.day44.deviceTask;

public abstract class Computer extends Device{
    public Computer(String brand, String model, int price, String color, char size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    public void runsJava(){
        System.out.println(getBrand() + " is started running Java Programming Language.");
    }

    @Override
    public void turnOn() {
        System.out.println(getBrand() + " is turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println(getBrand() + " is turned off.");
    }



}
