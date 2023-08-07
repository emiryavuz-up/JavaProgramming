package day33_Statics;

import java.util.Arrays;

public class TestIphone {

    public static void main(String[] args) {

        System.out.println( Iphone.hasBattery);

        Iphone iphone1 = new Iphone();
        iphone1.colour = "White";

        System.out.println(iphone1.colour);

        Iphone iphoneTest = new Iphone();
        iphoneTest.method1();





    }
}
