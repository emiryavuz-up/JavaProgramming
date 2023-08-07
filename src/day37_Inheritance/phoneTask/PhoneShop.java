package day37_Inheritance.phoneTask;

public class PhoneShop {

    public static void main(String[] args) {

    iPhone iphone = new iPhone("Diamond Pro Plus Elite X345", "Huge", 450000, "Colourless");
    Samsung samsung = new Samsung("Galaxy Super Milky Way S300","6 Inches", 420000, "Rainbow");
    Nokia nokia = new Nokia("Brick", "4 inches", 50, "Gray");

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);

        iphone.call(155);
        iphone.text(1887539851);
        iphone.faceTime(505284789);
        iphone.faceTime("smyrna@gmail.com");

        System.out.println("------------------------------");

        samsung.call(911);
        samsung.text(3929135);
        samsung.freeze();

        System.out.println("-------------------------------");

        nokia.call(244);
        nokia.text(5981981);
        nokia.selfDefense();

        System.out.println("--------------------------------");

        //inherited as it is not changed
        System.out.println(Phone.hasBattery);
        System.out.println(iPhone.hasBattery);
        System.out.println(Samsung.hasBattery);
        System.out.println(Nokia.hasBattery);
    }

}
