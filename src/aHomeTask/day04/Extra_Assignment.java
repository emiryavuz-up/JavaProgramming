package aHomeTask.day04;

//Five friends are going to the theater. They have purchased a row of five seats with an aisle on either end.
//
//        5 String variables are already declared to stored their names.
//
//        James doesn't want to sit next to Jill
//        Betty and Herb are dating and want to sit next to each other
//        Bob wants to sit on an left side aisle
//        James wants to sit on the aisle
//        Provide a seating order that conforms to the above rules. An example of an invalid seating order is:
//
//        James, Betty, Herb, Bob, Jill
//        The above arrangement is invalid because: Bob is not sitting on left aisle.
//
//        Specify the seating order as the names separated by commas and a space (as in the above example).
//        Use variables and print names in the right order.

public class Extra_Assignment {

    public static void main(String[] args) {
/*
        String Betty_and_Herb = "from left 3rd and 4th seats, ";
        String Bob = "left side aisle, ";
        String Jill = "Jill 2nd on the left, ";
        String James = "right side aisle, ";

        System.out.print(" Bob " + Bob);
        System.out.print(" Jill " + Jill);
        System.out.print(" Betty_and_Herb " + Betty_and_Herb);
        System.out.print(" James " + James);
        bob jill betty herb james
        */

        String name1 = "James";
        String name2 = "Jill";
        String name3 = "Bob";
        String name4 = "Betty";
        String name5 = "Herb";

        System.out.println(name3 + "," + name2 + "," + name4 + "," + name5 + "," + name1);


    }


}
