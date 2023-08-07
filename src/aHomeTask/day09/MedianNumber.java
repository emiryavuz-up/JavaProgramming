package aHomeTask.day09;

   /*
       write a program that can find the median number between three DIFFERENT given integers

			Ex:
				a = 10, b= 15, c = 20;

			Output:
				15 is the median number

			Posibility #1: a could be median number
			Posibility #2: b could be median number
			Posibility #3: c could be median number

         */

public class MedianNumber {

    public static void main(String[] args) {

        int a = 20,
                b = 50,
                c = 30;
                        //  a=15, b=10, c=20 // a=15, b=20, c=10
        boolean aIsMedian = (a > b && a < c) || (a > c && a < b); // if median number given for "A"
        // in order for a to be the median number: one of those conditions has to be matched!!!!!!!!
        // if c is the maximum, b is the minimum number // then a is the median number
        // // if b is the maximum number. c is the minimum number // then a is the median number
        // b=15, a=20, c=10

        boolean bIsMedian = (b > c && b < a) || (b > a && b < c); // // if median number given for "B"
        // two possible entry = either c is the maximum/minimum or a is maximum/minimum;
        // if a is the maximum and c minimum number // then b is the median number
        // // if c is the maximum number. a is the minimum number // then a is the median number

        boolean cIsMedian = !aIsMedian && !bIsMedian; // // if median number given to "C"

        if (aIsMedian){ // if a is the median number
            System.out.println(a + " is the median number");
        }
        if (bIsMedian){ // if b is the median number
            System.out.println(b + " is the median number");
        }
        if (cIsMedian){ // if c is the median number
            System.out.println(b + " is the median number");
        }



    }


}
