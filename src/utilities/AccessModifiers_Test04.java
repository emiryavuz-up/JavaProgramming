package utilities;

import day40_FinalKeyword.ProtectedAccessModifier;

public class AccessModifiers_Test04 extends ProtectedAccessModifier {

    public static void main(String[] args) {

        System.out.println(AccessModifiers_Test04.name2); // protected is accessible outside of package because this class is the subclass

        AccessModifiers_Test04.method2(); // accessible

      //  AccessModifiers_Test04.method1(); // not accessible

    }


}
