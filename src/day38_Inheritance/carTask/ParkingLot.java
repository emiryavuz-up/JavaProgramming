package day38_Inheritance.carTask;

import day37_Inheritance.scrumTask.Tester;

public class ParkingLot {

    public static void main(String[] args) {

        Toyota toyota = new Toyota("Camry", "Gray", 2000, 12312, 123456);

        BMW bmw = new BMW("i8", "White", 2021, 240000, 100);

        Tesla tesla = new Tesla("Model S", "Black", 2023, 250000, 0);

        System.out.println(toyota);
        System.out.println(bmw);
        System.out.println(tesla);

        toyota.reliable();
        bmw.racing();
        bmw.breaksDown();
        tesla.autoPilot();
    }
}
