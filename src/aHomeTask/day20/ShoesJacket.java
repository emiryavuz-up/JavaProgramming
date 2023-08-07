package aHomeTask.day20;

public class ShoesJacket {

    public static void main(String[] args) {

        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};

        for (int i = 0; i < items.length; i++) {
            String eachWord = items[i];
            //eachWord = Gloves
            //items[i] = 0 || 1 || 2 || 3 || 4 || 5

          if(eachWord.equals("Gloves")){
              System.out.println("First index number of \"Gloves\" is: " + i);

              break;
          }

        }
        boolean iPad = false;

        for (int i = 0; i < items.length; i++) {
            String eachWord2 = items[i];
            if(eachWord2.contains("iPad")){
               iPad = true;
                System.out.println("Does items contain \"iPad\": " + iPad);

            }
        }
        System.out.println("");

        for (int i = 0; i < items.length; i++) {
            String itemReport = items[i] + " - " + prices[i] + " - " + itemIDs[i];
            System.out.println(itemReport);
        }



    }
}
/*
Given the following arrays:
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};


        1. find out the first index number of "Gloves"

        2. find out if "iPad" is contained in the item list

        3. Print the report of each shopping item
            name - price - #ID
 */