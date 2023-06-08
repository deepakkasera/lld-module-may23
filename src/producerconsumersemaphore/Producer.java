package producerconsumersemaphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;

public class Producer implements Runnable {
    Queue<Object> store;
    int maxSize;

    String name;
    Semaphore producerSemaphore;
    Semaphore consumerSemaphore;
    Lock lock;
    Producer(Queue<Object> store, int maxSize, String name, Semaphore producerSemaphore, Semaphore consumerSemaphore, Lock lock) {
        this.store = store;
        this.maxSize = maxSize;
        this.name = name;
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
        this.lock = lock;
    }
    @Override
    public void run() {
        while (true) {//Infinite number of producers are available.
            try {
                producerSemaphore.acquire(); //producerSemaphore--
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            lock.lock();
            if (store.size() < maxSize) {
                System.out.println(name + " is adding the object, size = " + store.size());
                store.add(new Object());
            }
            lock.unlock();
            consumerSemaphore.release();
        }
    }
}
