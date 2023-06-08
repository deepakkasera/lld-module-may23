package producerconsumerproblemusingsemaphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable {
    Queue<Object> store;
    int maxSize;
    String name;
    Semaphore producerSemaphore;
    Semaphore consumerSemaphore;

    Consumer(Queue<Object> store, int maxSize, String name, Semaphore producerSemaphore, Semaphore consumerSemaphore) {
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
                consumerSemaphore.acquire();
                store.remove();
                System.out.println(name + " has consumed the shirt, size = " + store.size());
                //Consumer has bought the shirt, now the slot is available, notify the producer to come.
                producerSemaphore.release();
            } catch (InterruptedException e) {
                System.out.println("Inside the catch block");
                throw new RuntimeException(e);
            }

        }
    }
}
