package aHomeTask.day44.deviceTask;

import day33_Statics.Iphone;

import java.awt.*;

    public class DeviceTest extends Device{
        public DeviceTest(String brand, String model, int price, String color, char size, boolean hasBattery, boolean hasPowerButton) {
            super(brand, model, price, color, size, hasBattery, hasPowerButton);
        }

        public static void main(String[] args) {
            // Create iPhone object
            iPhone iPhone = new iPhone("iPhone", "12", 999, "Black", 'L', true, true);
            testDevice(iPhone);
            System.out.println("Operating System\t:\t" + iPhone.getOS());

            // Create Samsung object
            Samsung samsung = new Samsung("Samsung", "S21", 799, "Blue", 'S', true, true);
            testDevice(samsung);
            System.out.println("Operating System\t:\t" + samsung.getOS());


        }

        public static void testDevice(Device device) {
            System.out.println(device);
            device.turnOn();
            device.turnOff();

            if (device instanceof Phone) {
                Phone phone = (Phone) device;
                phone.call(1234567890L);

            }

            if (device instanceof Downloadable) {
                Downloadable downloadable = (Downloadable) device;
                downloadable.downloadApp();
                downloadable.getAppStoreName();
                downloadable.getOS();
            }
        }

        @Override
        public void turnOn() {

        }

        @Override
        public void turnOff() {

        }
    }


