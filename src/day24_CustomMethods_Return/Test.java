package day24_CustomMethods_Return;

public class Test {

    public static void main(String[] args) {


        String str = "asaakgakbaasbababababa";

        str = ReturnMethodPractice04.removeDuplicates(str);
        System.out.println(str);

        String name = "Java Programming";

        String reversedName = ReturnMethodIntro.reverse(name);

        System.out.println(reversedName);

    }


}
