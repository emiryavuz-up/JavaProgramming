package day47_Polymorphism;

public class InheritanceReview {
    int a;

    void method1(){

    }

    public InheritanceReview(int a) {
        this.a = a;
        System.out.println("Parent Class' Constructor");
    }

}

class A extends InheritanceReview{
    public A(int a) {
        super(a);
    }
}

class B extends A {

    public B(int a) {
        super(a);
    }

}

class C extends B{
    public C(int a) {
        super(a);
    }

}

class Aa extends A{
    public Aa(int a) {
        super(a);
    }
}
class Bb extends B{
    public Bb(int b) {
        super(b);
    }
}
class Cc extends C{
    public Cc(int c) {
        super(c);
    }
}

