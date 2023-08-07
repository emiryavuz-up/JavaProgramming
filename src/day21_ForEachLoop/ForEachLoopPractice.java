package day21_ForEachLoop;

public class ForEachLoopPractice {

    public static void main(String[] args) {

        // find first and last character of each words

        String[] words = {"Java Programming", "CodeBastards School", "Simushy", "Early Birds", "Angry Birds"};

        for( String each : words ){
            System.out.println(each.charAt(0) + "" + each.charAt(each.length()-1)); // if you don't have a string it will return you the addition
        }


    }

}
