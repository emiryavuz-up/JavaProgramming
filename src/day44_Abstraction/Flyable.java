package day44_Abstraction;

public interface Flyable {

    boolean canFly = true; // static and final by default // value has to be constant, so it is final
                            // shared across all instances, so it is static

    void fly();


}
