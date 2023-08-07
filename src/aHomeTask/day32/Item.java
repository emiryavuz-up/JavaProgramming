package aHomeTask.day32;

public class Item {

    public String name;
    public double unitPrice;
    public int quantity;

    public Item(String name, double unitPrice, int quantity){
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public double calcCost(){
        return unitPrice * quantity;
    }

    public String toString(){
        double totalCost = calcCost();
        return
                "Name of the item: " + name + "\nUnit Price: $" + unitPrice + "\nQuantity: " + quantity + "\nTotal Price: $" + totalCost;
    }

}
/*
4. Item Task:
		4.1 Create a class called Item
            Attributes:
                name, unitPrice, quantity

            Add a constructor to initialize all the fields

            Methods:
                calcCost(): returns the total price of the Item
                toString(): returns the name, unitPrice, quantity and total Price that's calculated by calcCost()
 */