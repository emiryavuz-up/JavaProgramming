package aHomeTasks.day35;

import java.util.ArrayList;
import java.util.Arrays;

public class SquareObjects {

    public static void main(String[] args) {

        Square square1 = new Square(10);

        System.out.println(square1);

        System.out.println("---------------");

        square1.setSide(30);

        System.out.println(square1);

        System.out.println("--------------------------");

        ArrayList<Integer> squares = new ArrayList<>();
        squares.addAll(Arrays.asList(10, 5));

        for (int i = 0; i < squares.size(); i++){
            for (int j = 0; j < squares.size(); j++) {
                int eachNr = squares.get(i);
                int numbersBetween = squares.get(j);
                System.out.println(eachNr);
                System.out.println(numbersBetween);
            }
        }


    }
}
