package day53_FunctionalInterface;

public class LambdaExpressions {

    public static void main(String[] args) {
        // parameters depend on abstract method of functional interface
        // "s" represents String argument which is <T> in the functional interface
        // it is a must to return a value when using Lambda Expression

        ThirdFunctionalInterface<String> stringReverse = (s) -> {
            String reverse = new StringBuilder(s).reverse().toString();
            return reverse;
        };

        String result = stringReverse.method("Something");
        System.out.println(result);

    }

}
