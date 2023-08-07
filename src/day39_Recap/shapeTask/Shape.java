package day39_Recap.shapeTask;

public class Shape {

    private String name;

    public String getName(){
        return  name;
    }

    public void setName(String name){ // gives you advantage as below, since it's private and encapsulated we can check if it is equal to or isEmpty isBlank...
        if(name == null){ // empty String and null are not the same
            System.err.println("Name can not be null");
            System.exit(1); // 1: something went wrong
        }
        if(name.isEmpty() || name.isBlank()){
            System.err.println("Invalid Name");
            System.exit(1); // something went wrong
        }
        this.name = name;
    }

    // subclasses must call this constructor to set the name of the shape
    public Shape(String name){ // constructor
        this.name = name;
    }

    public double area(){
        return 0; // we do not have certain solution so 0 is given as temp value because we provide a body to method
    }

    public double perimeter(){
        return 0; // we do not have certain solution so 0 is given as temp value because we provide a body to method
    }


    /*
    public String toString(){ //

    }
 */

    /*
   // @Override => not mandatory but optional - it is to check if the method is overriden
    // calling the toString method of the superclass
    public String toString() {
        return super.toString(); // super means superclass, so it calls superclasses toString method.
    }
*/

    @Override
    public String toString() {
        return "Shape\n" +
                " name =\t'" + name + '\'' +
                " area =\t'" + area() + '\'' +
                " perimeter =\t'" + perimeter() + '\'';
    }
}

/*
Shape:
	variables:
			name

	Encapsulate the field

	Add a constructor to set the field

	Methods:
		area(){}
		perimeter(){}
 */