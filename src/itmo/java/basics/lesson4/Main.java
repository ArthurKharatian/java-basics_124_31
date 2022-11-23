package itmo.java.basics.lesson4;

import itmo.java.basics.lesson2.Car;
import itmo.java.basics.lesson2.Color;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] intArray = new int[10];

        intArray[0] = 20;
        intArray[1] = 23;
        intArray[2] = 244;
        intArray[3] = 2214;
        intArray[4] = 21230;
        intArray[5] = 440;
        intArray[6] = 650;
        intArray[7] = 650;
        intArray[8] = 650;
        intArray[9] = 650;


//        System.out.println(Arrays.toString(intArray));


        String[] strings = new String[5];
//        System.out.println(Arrays.toString(strings));

//        long[] longs = new long[]{123L, 321L, 333L};
        long[] longs = {123L, 321L, 333L};
//        System.out.println(Arrays.toString(longs));

        Car[] cars = new Car[3];

        cars[0] = new Car("Lada", "Vesta", true, Color.RED);
        cars[1] = new Car("Kia", "K5", true, Color.BLACK);
        cars[2] = new Car("BMW", "X6", true, Color.WHITE);

//        System.out.println(Arrays.toString(cars));


//        System.out.println(cars[3]);  <- ArrayIndexOutOfBoundsException
//        System.out.println(cars[-1]); <- ArrayIndexOutOfBoundsException


        for (int i = 0; i < intArray.length; i++) {

//            if (intArray[i] <= 650) {
//                continue;
//            }

//            if (i % 2 == 0) {
//
//                System.out.println(intArray[i]);
//            }

        }


//        for (Car car : cars) {
//            if (car.getColor() == Color.BLACK) {
//                break;
//            }
//
//            System.out.println(car);
//        }

        int x = 0;

//        do {
//            //logic
//
//            System.out.println(++x);
//
//        }  while (x != 10);


//        while (x != 5) {
//            //logic
//            System.out.println(x++);
//        }


//        varargMethod("qwert", true);
//        varargMethod("123");

//        arrayMethod(cars, intArray);


        System.out.println(Arrays.toString(intArray));
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));

        System.out.println(Arrays.binarySearch(intArray, 244));
        System.out.println(Arrays.binarySearch(intArray, 500));
        System.out.println(Arrays.binarySearch(intArray, 350));


    }



    public static  void varargMethod(String str, boolean... line) {

        for (boolean b : line) {

        }
//        System.out.println(Arrays.toString(line));
    }


    public static  void arrayMethod(Car[] cars, int[] ints) {
        for (Car car : cars) {

        }
        System.out.println(Arrays.toString(cars));
    }

}
