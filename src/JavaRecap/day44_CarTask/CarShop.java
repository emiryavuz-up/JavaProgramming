package JavaRecap.day44_CarTask;

public class CarShop{
    public static void main(String[] args) {

        Tesla tesla = new Tesla("Tesla", "S Pro", 2023, 450000, "White");
        System.out.println(tesla);
        tesla.drive();
        tesla.start();
        tesla.autoPark();
        tesla.selfDrive();
        Toyota toyota = new Toyota("Toyota", "Accent", 1990, 400, "Black");
        System.out.println(toyota);
        toyota.drive();
        toyota.start();


    }


}
