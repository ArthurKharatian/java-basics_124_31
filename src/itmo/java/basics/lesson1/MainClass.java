package itmo.java.basics.lesson1;

import java.io.IOException;
import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) throws IOException {
//        System.out.println("Hello world!");

        byte b = 100;
        short s = 123;
        int i = 500;
        long l = 5000000000L;
        float f = 12.3f;
        double d = 14.5;

        char c = 'c';
        boolean isTrue = true;

        byte i1 = (byte) (b + i);
        int i2 = b + i;


//        System.out.println(i1);
//        System.out.println(i2);

        // Hello!

        /*
        Comment
         */

        /**
         *  Java
         */


        long q = (b + i);


        double i3 = i * 1.0 / 3;

//        System.out.println(i3);

        String str = "Java";
//        System.out.println(str);


        if (true) {
            //logic
        }


        if (true) {
            //

        } else {
            //
        }


        if (true) {

        } else if (false) {
            //
        } else if (false) {

        } else if (false) {

        } else {

        }


        int x = 10;
        int y = 20;

        // x == y; x != y; x > y: x < y;  x >= y; x <= y; x % 2 == 0;


        if (x == y && x != 0) {

        }


        if (x == y || x != 0) {
            //logic
        }

        int a = 0;


        String result = a == 2 ? "Hello" : a == 3 ? "Java" : "Programmer";
//        System.out.println(result);


        Scanner scanner = new Scanner(System.in);
//        String str1 = scanner.nextLine();
//        System.out.println(str1);
//
//        int i4 = scanner.nextInt();
//        System.out.println(i4);


//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String s1 = reader.readLine();
//
//        System.out.println(s1);
//
//        int i4 = Integer.parseInt(s1);
//
//        System.out.println(i4);


//        System.out.println(switcher(12));

        switcherBreak(20);

    }


    public static String switcher(Integer number) {

        switch (number) {
            case 10:
                return "ten";
            case 20:
                return "twenty";

            default:
                return "illegal number";

        }


    }

    public static void switcherBreak(Integer number) {

        int x = 0;

        switch (number) {
            case 10:
                x = 20;
                break;
            case 20:
                x = 50;
                break;
            default:
                x = -1;

        }

        System.out.println(x);


    }

    // Hello from Github

}
