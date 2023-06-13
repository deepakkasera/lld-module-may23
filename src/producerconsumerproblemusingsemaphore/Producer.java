package producerconsumerproblemusingsemaphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable {
    Queue<Object> store;
    int maxSize;
    String name;

    Semaphore producerSemaphore;
    Semaphore consumerSemaphore;

    Producer(Queue<Object> store, int maxSize, String name, Semaphore producerSemaphore, Semaphore consumerSemaphore) {
        this.store = store;
        this.maxSize = maxSize;
        this.name = name;
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
    }
    @Override
    public void run() {
        while (true) {//Infinite number of producers are available.
            try {
                producerSemaphore.acquire(); // producerSemaphore-- -> 0
                store.add(new Object()); // P1, P2, P3
                System.out.println(name + " has added the shirt, size = " + store.size());
                //Producer has produced the shirt, notify the consumer to come and buy the shirt.
                consumerSemaphore.release(); // consumerSemaphore++
            } catch (InterruptedException e) {
                System.out.println("Inside the catch block");
                throw new RuntimeException(e);
            }
        }
    }
}

