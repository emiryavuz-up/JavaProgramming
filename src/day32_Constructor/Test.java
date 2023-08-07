package day32_Constructor;

public class Test {

    public Test(){ // A
        System.out.println("A");
    }

    public Test(int a){ // A  B
        this(); // calling the first constructor
        System.out.println("B");
    }

    public Test(double a){ // A  B  C
        this(10);
        System.out.println("C");
    }

    public Test(String str){ // A  B  C  D
        this(20.5);
        System.out.println("D");
    }

    public static void main(String[] args) {
    Test test = new Test("Hello");
    }
}
