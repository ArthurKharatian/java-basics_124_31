package itmo.java.basics.lesson7;

public class OuterClass {

    private int a;
    private int b;

    static  String name = "Mike";

    void set(final int x, final  int y){
        this.a = x;
        this.b = y;
    }

    class InnerClass {

        void display() {
            set(4, 6);
            System.out.println("sum = " + (a + b));

        }

    }

    public static void main(String[] args) {
//        OuterClass outerClass = new OuterClass();
//        outerClass.innerMethod();

        OuterClass.NestedStaticClass nestedStaticClass = new OuterClass.NestedStaticClass();
        nestedStaticClass.methodNestedStaticClass();

    }

    public void innerMethod() {
        OuterClass.InnerClass innerClass = new OuterClass.InnerClass();
        innerClass.display();
    }


    static class NestedStaticClass {
        void methodNestedStaticClass() {
            System.out.println("Static nested");
            System.out.println(name);
        }
    }

}
