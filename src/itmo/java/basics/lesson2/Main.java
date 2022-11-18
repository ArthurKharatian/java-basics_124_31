package itmo.java.basics.lesson2;

public class Main {

    public static void main(String[] args) {

        Car car = new Car("BMW", "X5", true, Color.WHITE);

//        car.setPrice(10_000_000L);
//
//        System.out.println(car.getPrice());
//        System.out.println(car.getBrand());
//        System.out.println(car.getModel());

//        System.out.println(car.getSeatPlace());


        System.out.println(car);

    }

    public void someMethod() {
        int x = 0;
        String s = "";

        System.out.println(x);
        System.out.println(s);

        int a;

        if (s != null) {
            a = 3;
        } else {
            a = 5;
        }

        System.out.println(a);

    }


}
