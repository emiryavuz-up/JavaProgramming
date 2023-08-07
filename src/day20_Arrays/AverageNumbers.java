package day20_Arrays;

public class AverageNumbers {

    public static void main(String[] args) {
    
        
        int[] numbers = {10, 20, 30, 40, 50, 60};

        int sum = 0; // we will add each of the number with addition to update sum 10 + 20 + 30 + 40 + 50...

        for (int i = 0; i < numbers.length; i++) { // go from 0 to numbers' length
            sum += numbers[i]; // add up each character and add each number to sum = 10 + 20 = 30 + 40 + 70
        }
        
        double averageNumber = sum / numbers.length; // divide length by sum and give result to averageNumber
        // 10/3 ==> 3. but to get exact decimal result we use double

        System.out.println("averageNumber = " + averageNumber);
        
    }
    
}
