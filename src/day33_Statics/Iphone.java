package day33_Statics;

public class Iphone {

    public static String brand = "Apple"; // apple will not be changed or will have different copy because all phones will be ihpnoe

    public String model; // instance variable created because each model will be different

    public double price; // instance variable created because each price when used in objects should have different copy

    public static String OS = "iOS"; // static variable created because iOS is used by all the phones

    public String colour;

    public static String madeIn = "China"; // static because country is the same
    public static boolean hasBattery = true; // static since it applies all the iPhones
    public static boolean touchScreen = true; // static since it applies all the iPhones
    public static boolean hasCamera = true; // static since it applies all the iPhones
    public static boolean hasFaceTime = true; // static since it applies all the iPhones

   /*
    public static void printModelAndPrice(){
        System.out.println(model + " : " + price); // static methods in java does not accept instances
    }
*/

    public void method1(){
        System.out.println(model + " : " + price);
        System.out.println(hasBattery);
    }


}
