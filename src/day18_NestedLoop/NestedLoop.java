package day18_NestedLoop;

public class NestedLoop {

    public static void main(String[] args) {


        for (int j = 0; j < 4; j++) { // j: 0, 1, 2, 3

            for (int i = 0; i < 3; i++) { // when j executed 4 times, this loop will be executed 3 times
                System.out.println("Simushy"); // repeated inner loop is this for loop

            }

        }

    }

}
