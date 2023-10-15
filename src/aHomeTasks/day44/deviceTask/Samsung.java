package aHomeTasks.day44.deviceTask;

public class Samsung extends Phone implements AndroidApps {


    public Samsung(String brand, String model, int price, String color, char size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public void downloadApp() {
        System.out.println(getBrand() + " is downloading an app.");
    }

    @Override
    public String getAppStoreName() {
        return appStoreName;
    }

    @Override
    public String getOS() {
        return OS;
    }

}
