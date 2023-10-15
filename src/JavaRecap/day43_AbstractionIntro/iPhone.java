package JavaRecap.day43_AbstractionIntro;

public class iPhone extends Phone{

    @Override
    void call() {
        System.out.println("iPhone is calling something");
    }
    @Override
    void turnOn(){
        System.out.println("iPhone is turned on");
    }

    public static void main(String[] args) {

        iPhone iPhone = new iPhone();
        iPhone.call();
        iPhone.turnOn();

    }

}
