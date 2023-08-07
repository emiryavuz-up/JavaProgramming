package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class GradeCalculator {

    public static void main(String[] args) {

        ArrayList<Integer> scores = new ArrayList<>();
        scores.addAll(Arrays.asList(100,90,75,85,65,85,55,45,73,73,35,47));

        ArrayList<Integer> gradeofA = new ArrayList<>(scores);
        gradeofA.removeIf( p -> !(p >= 90 && p <= 100));
        System.out.println(gradeofA);

        ArrayList<Integer> gradeofB = new ArrayList<>(scores);
        gradeofB.removeIf(p -> !(p >= 80 && p <= 89));
        System.out.println(gradeofB);

        ArrayList<Integer> gradeofC = new ArrayList<>(scores);
        gradeofC.removeIf(p -> !(p >= 70 && p <= 79));
        System.out.println(gradeofC);

        ArrayList<Integer> gradeofD = new ArrayList<>(scores);
        gradeofD.removeIf(p -> !(p >= 60 && p <= 69));
        System.out.println(gradeofD);

        ArrayList<Integer> gradeofF = new ArrayList<>(scores);
        gradeofF.removeIf(p -> !(p <= 59));
        System.out.println(gradeofF);

        gradeofF.removeAll(gradeofA);
        gradeofF.removeAll(gradeofB);
        gradeofF.removeAll(gradeofC);
        gradeofF.removeAll(gradeofD);

        System.out.println(gradeofF);

        System.out.println("Total number of A: "+ gradeofA.size());
        System.out.println("Total number of B: "+ gradeofB.size());
        System.out.println("Total number of C: "+ gradeofC.size());
        System.out.println("Total number of D: "+ gradeofD.size());
        System.out.println("Total number of F: "+ gradeofF.size());



    }

}
