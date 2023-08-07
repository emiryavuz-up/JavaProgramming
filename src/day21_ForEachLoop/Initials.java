package day21_ForEachLoop;

public class Initials {

    public static void main(String[] args) {

        String[] names = {"Koca Kafa", "Kucuk Limon", "Minik Jager", "Prenses Maya", "ASD BASD", "DAA BAA"};

        for (String each : names) {

            String initial = each.charAt(0) + "." + each.charAt( each.indexOf(" ")+1 );
            System.out.println(initial);
        }

    }

}
