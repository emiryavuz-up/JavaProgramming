package day19_LoopPractices;

public class ExitMethod {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {

            if(i == 3){
                // break; // terminates the loop  = 2 + Simushy
                // continue; // terminates the current iteration of the loop = 4 + Simushy
                System.exit(0); // terminates the entire program = 2 then stops everything
            }

            System.out.println(i);
        }

        System.out.println("Simushy");


    }

}
