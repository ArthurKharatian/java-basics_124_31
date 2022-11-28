package itmo.java.basics.lesson6;

public interface Moveable {

    public static final String NAME = "Brand";

    public abstract void printTransportInfo();
    public abstract String transportName();

    default void someMethod() {
        System.out.println("someMethod");
    }


    public static void staticMethod() {
        // logic
    }

}
