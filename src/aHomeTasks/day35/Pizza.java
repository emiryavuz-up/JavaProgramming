package aHomeTasks.day35;

public class Pizza {

    private String size;
    private int numberOfCheeseTopping, numberOfPepperoniTopping;

    public String getSize(){
        if(  !(size.equalsIgnoreCase("small") || size.equalsIgnoreCase("medium") || size.equalsIgnoreCase("large"))  ){
        return "Invalid Size: " + size;
        }
        return size;
    }
    public void setSize(String size){
        if(size.equalsIgnoreCase("small") || size.equalsIgnoreCase("medium") || size.equalsIgnoreCase("large")){
            this.size = size;
        }else{
            System.err.println("Invalid size: " + size);
        }

    }
    public int getNumberOfCheeseTopping(){
        return numberOfCheeseTopping;
    }
    public int getNumberOfPepperoniTopping(){
        return numberOfPepperoniTopping;
    }

    public void setNumberOfCheeseTopping(int numberOfCheeseTopping) {
        if(numberOfCheeseTopping < 0){
            return;
        }
        if(size.equalsIgnoreCase("small") && numberOfCheeseTopping > 3){
            return;
        }
        if(size.equalsIgnoreCase("medium") && numberOfCheeseTopping > 4){
            return;
        }
        if(size.equalsIgnoreCase("large") && numberOfCheeseTopping > 5){
            return;
        }
        this.numberOfCheeseTopping = numberOfCheeseTopping;
    }

    public void setNumberOfPepperoniTopping(int numberOfPepperoniTopping){
        if(numberOfPepperoniTopping < 0){
            return;
        }
        if(size.equalsIgnoreCase("small") && numberOfPepperoniTopping > 3){
            return;
        }
        if(size.equalsIgnoreCase("medium") && numberOfPepperoniTopping > 4){
            return;
        }
        if(size.equalsIgnoreCase("large") && numberOfPepperoniTopping > 5){
            return;
        }
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public Pizza(int numberOfCheeseTopping, int numberOfPepperoniTopping, String size){
        setSize(size);
        setNumberOfCheeseTopping(numberOfCheeseTopping);
        setNumberOfPepperoniTopping(numberOfPepperoniTopping);
    }

    public int calcCost(){
        int totalCost = 0;
        if(size.equalsIgnoreCase("small")){
           totalCost = 2 * getNumberOfCheeseTopping() + getNumberOfCheeseTopping() + 10;
        }else if(size.equalsIgnoreCase("medium")){
            totalCost = 2 * (getNumberOfPepperoniTopping() + getNumberOfCheeseTopping() + 12);
        }else if(size.equalsIgnoreCase("large")){
            totalCost = 2 * (getNumberOfPepperoniTopping() + getNumberOfCheeseTopping() + 14);
        }
        return totalCost;
    }


    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", totalCostOfPizza=" + calcCost() +
                '}';
    }
}
/*
Pizza Task:
		5.1 Create class named Pizza:
				private variables:
					size, numberOfCheeseTopping, numberOfPepperoniTopping

				Encapsulate all the fields
						Conditions:
							size of the pizza can only be small, medium, large. case in-sensitive

							Number of cheese topping can not be negative, the maximum number of cheese topping is:
										small: 3
										medium: 4
										large: 5

							Number of pepperoni topping can not be negative, the maximum number of pepperoni topping is:

										small: 4
										medium: 5
										large: 6

				Add a constructor that allows user to set all the fields when the object is created.
								(If the arguments not valid it should not be set to the instances)


				Methods:
					calcCost(): returns the totalCost of the pizza
					toString():returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()


		Pizza cost is determined by:
                        S: $10 + $2 per topping
                        M: $12 + $2 per topping
                        L: $14 + $2 per topping

 */