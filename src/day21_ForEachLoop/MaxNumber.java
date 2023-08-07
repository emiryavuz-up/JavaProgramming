package day21_ForEachLoop;

public class MaxNumber {

    public static void main(String[] args) {

    int[] numbers = {10, 5, 4, 20, 1, 10};
    int max = numbers[0]; // 10

        for (int i = 0; i < numbers.length; i++) {
            // ...
        }

        for (int number : numbers) {
            if(number > max){
                max = number;
            }

        }


    }

}
