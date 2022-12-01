package itmo.java.basics.lesson7;

public class Main {
    public static void main(String[] args) {
//        OuterClass.NestedStaticClass nestedStaticClass = new OuterClass.NestedStaticClass();
//        nestedStaticClass.methodNestedStaticClass();


        SomeClass someClass = new SomeClass() {

            @Override
            public void print() {
                System.out.println(name());
            }

            @Override
            public String name() {
                return "Alex!";
            }

            void someMethod() {
                System.out.println(123);
            }
        };


        someClass.print();

    }

    void nonStatic() {
//        OuterClass.InnerClass innerClass = new OuterClass.InnerClass();  <- невозможно создать!
    }
}
