package main;


/**
 * Concurrency
 */

public class Concurrency extends Thread {
    public static int c = 0;
    public static void main(String[] args) {
        System.out.println("not in concurrency level");
        Concurrency thread = new Concurrency();
        thread.start();
        while (thread.isAlive()) {
            System.out.println("waiting");
        }
        System.out.println(c);
        c++;
        System.out.println(c);
    }

    public void run() {
        c++;
        System.out.println("is concurrency working");
        for (int i = c; i < 20; i++) {
            System.out.println(i); 
        }
    }
}
