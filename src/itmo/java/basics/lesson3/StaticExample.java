package itmo.java.basics.lesson3;

public class StaticExample {

    public static final String STATIC_CONSTANT = "some constant";
    public String string;
    public static String staticString;
    private final String nonStaticString;
    protected String protectedString;
    Integer defaultInteger;

    static {
        System.out.println("===================");
        System.out.println("static block start");
        staticString = "staticString";
//        nonStaticString = "123";    -> переменная не статическая
        System.out.println(staticString);
        System.out.println("static block end");
        System.out.println("===================");
    }

    {
        System.out.println("===================");
        System.out.println("non-static block start");
        nonStaticString = "nonStaticString";
        staticString = "123";
        System.out.println(nonStaticString);
        System.out.println("non-static block end");
        System.out.println("===================");
    }


    public static void main(String[] args) {
        System.out.println("Before");
        StaticExample staticExample = new StaticExample();
        System.out.println("After");
    }

    public static void printStaticVar() {
        StaticExample staticExample = new StaticExample();
        staticExample.printNonStaticMethod();
        System.out.println(staticString + " in a static method");
    }


    public void someNonStatic(){
        //body
    }

    public void printNonStaticMethod() {
        printStaticVar();
        someNonStatic();
    }

    public static void finalTest(final int x, final int y) {

        int a = x + y;

//        x = a;    -> изменить нельзя!

    }

    public final void printNonStaticMethod2() {

    }

}
