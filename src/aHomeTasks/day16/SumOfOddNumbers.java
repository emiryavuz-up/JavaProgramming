package aHomeTasks.day16;

public class SumOfOddNumbers {

    public static void main(String[] args) {


        int odd = 0;
        for(int i = 0; i <= 100; i++){

            if(i % 2 != 0){
                odd += i;
            }
        }
        System.out.println(odd);
    }

}
