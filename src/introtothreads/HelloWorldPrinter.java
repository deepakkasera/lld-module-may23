package introtothreads;

public class HelloWorldPrinter implements Runnable {
    public void run() {
        System.out.println("Hello World, Printed by Thread : " + Thread.currentThread().getName());
    }
}
