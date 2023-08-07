package day08_IfStatements;

public class SwapTwoVariables_WithTemporaryVariable {

    public static void main(String[] args) {

    int a = 10;

    int b = 160;

    int c = b;

        System.out.println("c = " + c);

    a = c;

// -------------------------------------------------

        // if you assing b value to a; // b = 10
        // if you assign a value to b; // a = 15
       // so to reuse even though its deleted you create int c = b; // c = 15;

// -----------------------------------------------------

      //  System.out.println("a = " + a); // 15
      //  System.out.println("b = " + b); // 100
    }


}
