package itmo.java.basics.lesson6;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car("Lada", "Vesta", true, Color.WHITE);

//        Field[] declaredFields = car.getClass().getDeclaredFields();
//        for (Field field : declaredFields) {
//            System.out.println(field);
//        }

        Object o = new Object();


        Parent parent = new Parent();
        Parent parent2 = new Child();
        Parent parent3 = new AnotherChild();

//        Child child = new Child();

//        Child child = new Parent();   // создание невозможно
//
//        parent.print();
//        parent2.print();
//        parent3.print();


//       ((Child)child).print();  // <- ClassCastException
//        (Parent)child).print(); // <- OK!

//        if (parent instanceof Child) {
//
//        }


//        Moveable scania = new Bus();
//        Moveable volvo = new Car();
//
//        printTransportInfo(scania);
//        printTransportInfo(volvo);

        Plane plane = new Plane(2000, 200, true);
        printTransportInfo(plane);


    }


    public static void printTransportInfo(Moveable transport) {
        transport.printTransportInfo();
    }


    public static void printTransportInfo(Transport transport) {
        transport.printTransportInfo();
    }

}
