package itmo.java.basics.lesson14;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new MyRunnable());
//        MyThread myThread = new MyThread();
//
//        thread.start();
//        thread.join();
//        myThread.start();


        thread.setDaemon(true);

        new ThreadExample();
        new ThreadExample();
        new ThreadExample();
        new ThreadExample();

    }
}
