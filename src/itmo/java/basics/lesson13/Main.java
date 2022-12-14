package itmo.java.basics.lesson13;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1234, 32, 434, 35, 6556, 653, 55);


        for (Integer integer : integers) {
            System.out.println(integer);
        }


        integers.forEach(System.out::println);

        integers.forEach(integer -> System.out.println(integer));


//
        integers.forEach(i -> {
            if (i < 200) {
                System.out.println(i);
            }
        });


    }
}
