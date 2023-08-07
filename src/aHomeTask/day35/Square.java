package aHomeTask.day35;

public class Square {

    private int side;

    public int getSide() {
        return side;
    }


    public void setSide(int side) {
        if(side < 0){
            return;
        }
        this.side = side;
    }
    public Square(int side){
        if(side < 0){
            return;
        }
        this.side = side;
    }

    public double calcArea(){ // calculates the area of the square
        return side * side;
    }
    public double calcPerimeter(){ // calculates the perimeter of the square
        return side * 4;
    } // calculates the perimeter of the square

    public String toString(){
        return
                "Side: " + side + "\nArea: " + calcArea() + "\nPerimeter: " + calcPerimeter();
    }


}
/*
1.1 Create a class named Square:
				Private variables:
					side

				Encapsulate all the fields

					Condition:
						side of the square should not be negative

				Add a constructor that allows user to set all the fields when the object is created.
								(If the arguments is not valid it should not be set to the instances)

				Methods:
					calcArea(): returns the area of square
					calcPerimeter(): returns the perimeter of square
					toString(): can display the side, area, perimeter of square when object is passed in print statement
 */