package day53_FunctionalInterface;


@FunctionalInterface
public interface ThirdFunctionalInterface<T> {

    // functional interface can only have one abstract method
    // implementation of the abstract method of a regular interface can be done by overriding in the subclass
    // implementation of the abstract method of a functional interface can be only done by using Lambda Expression which depends on functional interface
    // benefit is that less memory usage (1 method used for many different cases, as long as the arguments and return type matches)
    // define the type first when declaring functional interface by applying generic type --> which isn't specific
    // Generic type is TYPE SAFETY what you assign will be assigned


    // Functional interface that has an abstract method that takes one argument of any type and returns the same type --> <T> will be the generic type
    // Generic name must be given to the abstract method
    // This method takes one parameter
    T method(T data);



}
