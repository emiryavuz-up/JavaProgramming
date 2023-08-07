package day15_ForLoop;

public class ForLoopPractices {

    public static void main(String[] args) {

        // 15 16 17 18 ... 45

        /*
        System.out.print(15)
        System.out.print(16)
        ...
        System.out.print(45)
         */

        // do i need to repeat? if yes: include in the loop. if no: add it after the loop

        for(int i = 15; i <= 45; i++ ){ // i: represent above number to make the condition true
            System.out.print(i+" "); // whatever you give here will be repeated 45 times
        }
        System.out.println(); // to give an additional line after last 45

        System.out.println("----------------------------------------");

        /// 100 ~ 50

        for(int i = 100; i >= 50; i--){ // i: 100, 99 ... 50;
            System.out.print(i+" "); // PAY ATTENTION TO PRINT NOT LN TO DISPLAY WITHIN ONE LINE
        }

        System.out.println(); // to give a new line after 50

        // print all the even numbers between 1 ~ 55

        for(int i = 1; i <= 55; i ++){

            if(i % 2 == 0){ // to specify even number
                System.out.print(i+" ");
            }
        }

        System.out.println(); // to give an additional line after 54

        for(int i = 2; i <= 54; i += 2 ){ // increases value by two each time!!! so always gives equal nr.
            System.out.println(i+" ");
        }


        System.out.println();


        for(char i = 'a'; i <= 'z'; i++ ){
            System.out.print(i+" ");
        }

        for(char i = 'A'; i <= 'Z'; i++){
            System.out.print(i+" ");
        }

    }

}
