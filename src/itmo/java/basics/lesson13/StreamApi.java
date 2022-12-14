package itmo.java.basics.lesson13;

import itmo.java.basics.lesson2.Color;
import itmo.java.basics.lesson6.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class StreamApi {
    public static void main(String[] args) {
        List<PromoCode> promos = new ArrayList<>();
        promos.add(new PromoCode("SKIDKA200", false));
        promos.add(new PromoCode("SKIDKA500", true));
        promos.add(new PromoCode("SKIDKA600", false));
        promos.add(new PromoCode("SKIDKA100", false));
        promos.add(new PromoCode("SKIDKA400", false));
        promos.add(new PromoCode("SKIDKA300", true));
        promos.add(new PromoCode("SKIDKA500", false));
        promos.add(new PromoCode("SKIDKA600", true));
        promos.add(new PromoCode("SKIDKA100", true));
        promos.add(new PromoCode("SKIDKA100", true));
        promos.add(new PromoCode("SKIDKA100", false));
        promos.add(new PromoCode("SKIDKA100", false));


//        promos.stream()
//                .filter(PromoCode::getExpired)
//                .stringListMap(Collectors.toList())
//                .forEach(System.out::println);
//
//        System.out.println("============================");
//
//        promos.stream()
//                .filter(promoCode -> !promoCode.getExpired())
//                .stringListMap(Collectors.toList())
//                .forEach(System.out::println);


//        promos.stream()
//                .filter(promoCode -> promoCode.getCode().equals("SKIDKA600"))
//                .stringListMap(Collectors.toList())
//                .forEach(System.out::println);

//        promos.sort(Comparator.comparing(PromoCode::getCode).reversed());
//        promos.forEach(System.out::println);


        Map<String, List<PromoCode>> stringListMap = promos.stream().collect(Collectors.groupingBy(PromoCode::getCode));

        List<PromoCode> promoCodes = stringListMap.get("SKIDKA100");
//        promoCodes.forEach(System.out::println);


//        stringListMap.forEach((k, v) -> {
//            if (k.equals("SKIDKA100")) {
//                v.forEach(System.out::println);
//            }
//        });

        AtomicInteger counter = new AtomicInteger();

        promos.forEach(promoCode -> {
            if (!promoCode.getCode().equals("SKIDKA200")) {
                counter.getAndIncrement();
            }
        });

//        System.out.println(counter.get());


        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Bmw", "3", true, Color.WHITE));
        cars.add(new Car("Mercedes", "e200", true, Color.BLACK));
        cars.add(new Car("Mercedes", "e300", true, Color.BLUE));
        cars.add(new Car("Bmw", "4", true, Color.WHITE));
        cars.add(new Car("Mercedes", "c200", true, Color.YELLOW));
        cars.add(new Car("Bmw", "5", true, Color.WHITE));

        Set<String> collect = cars.stream()
                .map(Car::getModel)
                .collect(Collectors.toSet());


        System.out.println(collect);

    }
}
