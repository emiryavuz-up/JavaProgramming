package day18_NestedLoop;

public class NestedLoopPractice02 {

    public static void main(String[] args) {


        for (int j = 0; j < 10; j++) { // created to repeat the next statements

            for (int i = 0; i < 10; i++) { // to print 10 *  // when j's value becomes 0 this gets executed
                System.out.print("* "); // 10 = * * * * *...

            }

            System.out.println();

        }


    }

}


/*
Print the following shape by using a nested Loop:
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
 */