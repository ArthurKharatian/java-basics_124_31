package itmo.java.basics.lesson14;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        int i = 0;

        while (i < 50) {
            System.out.println("My runnable is running " + Thread.currentThread().getName());

//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }


            System.out.println(i++);
        }
    }
}
