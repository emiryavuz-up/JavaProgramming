package JavaRecap.day39_DeviceTask;

public class MyDevices {

    public static void main(String[] args) {

    Computer computer = new Computer("Apple", "Macbook Pro", 400000, true, true);
        System.out.println(computer);
        computer.runsIntelliJ();
    Phone phone = new Phone("Apple", "Iphone 13 Pro", 30000, true, true);
        System.out.println(phone);
        phone.call(985983);
        phone.text(3958581);
    TV tv = new TV("Apple", "Apple does not have a TV", 0, false, false);
        System.out.println(tv);
        tv.channelUp();
        tv.channelDown();

    }

}
