package itmo.java.basics.lesson10;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
//        File file = new File("files/text.txt");
//        File file2 = new File("files/output.txt");
//
//
//        try (BufferedReader reader = new BufferedReader(new FileReader(file)); BufferedWriter writer = new BufferedWriter(new FileWriter(file2))) {
//            String input;
//
////            while ((input = reader.readLine()) != null) {
////                System.out.println(input);
////            }
//
//        } catch (IOException e) {
//            System.err.println("Error: " + e.getMessage());
//        }
//
//
//        InputStream is = null;
//        OutputStream os = null;
//
//        try {
//
//            is = new FileInputStream(file);
//            os = new FileOutputStream(file2);
//
//            while (is.available() > 0) {
//                os.write(is.read());
//            }
//
//        } catch (IOException e) {
//            System.err.println("Error: " + e.getMessage());
//
//        } finally {
//            try {
//                if (is != null) {
//                    is.close();
//                }
//
//                if (os != null) {
//                    os.close();
//                }
//
//            } catch (IOException e) {
//                System.err.println("Error: " + e.getMessage());
//            }
//        }

        // apache poi

//        File file3 = new File("files/java.jpg");
//        File file4 = new File("files/javaModified.jpg");
//
//        try (BufferedReader reader = new BufferedReader(new FileReader(file3)); BufferedWriter writer = new BufferedWriter(new FileWriter(file4))) {
//            String input;
//            while (reader.ready()) {
//                writer.write(reader.readLine() + "123");
//            }
//
//
//        } catch (IOException e) {
//            System.err.println("Error: " + e.getMessage());
//        }
//

        Path path = Paths.get("/Users/user/Documents");

        File[] files = path.toFile().listFiles();

//        if (files != null) {
//
//            for (File file : files) {
//                System.out.println(file.getName());
//            }
//        }
//
//        System.out.println(path.getFileSystem());


        double space = path.toFile().getTotalSpace() / 1000_000_000.0;

        String info = new DecimalFormat("#.##").format(space) + "GB";

        System.out.println(info);


    }



}
