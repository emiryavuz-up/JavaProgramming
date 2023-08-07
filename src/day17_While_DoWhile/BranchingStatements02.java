package day17_While_DoWhile;

public class BranchingStatements02 {

    public static void main(String[] args) {

        for (char i = 'A'; i <= 'E'; i++) {
            System.out.println(i);

            if(i == 'C'){ // when you match with the "C"
                continue; // this will skip that "C" and will go to the next iteration
            }
            System.out.println(i);

        }

        System.out.println("------------------------------------------------------");
        // print all even numbers 1 ~ 10 (skip the odd numbers)

        for (int i = 1; i < 11; i++) { // 1, 2, 3, 4, 5, 6, 7, 8, 9, 10

            if(i % 2 != 0){ // 1, 3, 5, 7, 9 these numbers will make this condition true
                continue; // if they are true, continue will be executed and it will skip them and jump to the next iteration
                        // if it is false, it will be printed so opposite of being equal to 0 means odd numbers
            }
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("---------------------");


        for (int i = 1; i < 11; i++) {

            if(i%2==0){
                continue;
            }
            System.out.print(i + " ");
        }



    }

}
