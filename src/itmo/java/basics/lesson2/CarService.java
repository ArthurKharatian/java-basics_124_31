package itmo.java.basics.lesson2;

public class CarService {

    public static void main(String[] args) {
        Car car = new Car("BMW", "X5", true, Color.WHITE);
        car.setPrice(10000L);

        System.out.println(totalPrice(car, 1000));
    }

    public static Long totalPrice(Car car, Integer servicePrice) {
        if (servicePrice  == null) {
            System.err.println("servicePrice is null");
            return car.getPrice();
        } else {
            return car.getPrice() + servicePrice;
        }
    }





}
