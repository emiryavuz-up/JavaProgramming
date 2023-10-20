package aHomeTasks.aInterviewQuestions;

public class LargestInArrayExample {

    public static void main(String[] args) {

        int[] a = {1,2,5,6,3,2};
        int[] b = {44,66,99,77,33,22,55};

        int aSize = a.length;
        int bSize = b.length;

        /*if(aSize > bSize){
            System.out.println("a is larger.");
        }else{
            System.out.println("b is larger");
        }*/

        System.out.println("--------------");

        char c;

        for (c = 'A'; c <= 'Z' ; c++) {

            System.out.print(c + " ");

        }

        System.out.println("----------------");

        int length = 4;

        for (int i = 0; i < length; i++) {

            for (int j = 0; j < length; j++) {

                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("--------______--------");

        int[] z = {1,2,5,6,3,2};

        for (int i = 0; i < z.length; i++) {

            if(i % 2 == 0){
                System.out.println(i + " is even");
            }else{
                System.out.println(i + " is not even");
            }

        }


    }

}
