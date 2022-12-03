package itmo.java.basics.lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    static Logger logger = Logger.getLogger("Logger");

    //slf4j <- логирование
    //log4j
    public static void main(String[] args)  {
//        checkedExceptionMethod();
//        uncheckedExceptionMethod();

        try {
            read();

        } catch (IOException e) {
            throw new RuntimeException(e);

        } catch (NumberFormatException e) {
//            System.err.println("Bad format");
            logger.setLevel(Level.WARNING);
            logger.warning("Bad format");

        } catch (Exception e) {

        } finally {
            System.out.println("Finally block");
        }

        System.out.println("Process ok!");

    }


//    public static void checkedExceptionMethod()  {
//        try {
//            throw new MyCheckedException("MyCheckedException");
//        } catch (MyCheckedException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    public static void uncheckedExceptionMethod() {
//        throw new MyUncheckedException("MyUncheckedException");
//    }

    public static void read() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        int i = Integer.parseInt(str);
        System.out.println(i);
    }

}
