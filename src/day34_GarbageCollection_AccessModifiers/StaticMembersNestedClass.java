package day34_GarbageCollection_AccessModifiers;

public class StaticMembersNestedClass {

    public static int num = 100;

    static{

    }
    static class A{ // outer class

     static class B{ // inner class
         public static void method(){

         }


        }
    }

    static class C{

        public static void main(String[] args) {
            A.B.method();

        }
    }

}
