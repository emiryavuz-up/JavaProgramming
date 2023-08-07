package day31_Constructors;

public class PersonObjects {

    public static void main(String[] args) {

        Person person1 = new Person("smyrna", 'F', 5);
        // we can use it like this because we already created the constructor in the class
        // if we had not it would give us compiler error when used like this
        Person person2 = new Person("Maya", 'F', 5);


    }

}
