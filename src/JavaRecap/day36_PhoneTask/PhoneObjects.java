package JavaRecap.day36_PhoneTask;

public class PhoneObjects {

    public static void main(String[] args) {

        iPhone iphone = new iPhone("3 Pro", "40.5 cm", "Midnight Blue", 450.000);
        System.out.println(iphone);
        iphone.faceTime(121245677);
        iphone.call(431094);

    }
}
