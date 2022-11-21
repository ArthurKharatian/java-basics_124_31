package itmo.java.basics.lesson2;

public class MethodsExample {

    public static void main(String[] args) {

        someMethod(14, 66, 45);

        String info = getInfo();

        System.out.println(info);
    }


    public static void someMethod(int a, int b, int c) {

        System.out.println(a + b + c);

        System.out.println("void method!");
    }


    public static String getInfo() {
        return "info";
    }


}
