package week04.threads.implementsrunnable;

public class Main {
    public static void main(String[] args) {
        MyRunnable myRunnable= new MyRunnable();
     //   myRunnable.run(); -> böyle de çalışır.
        Thread thread= new Thread(myRunnable);
        thread.start();


    }
}
