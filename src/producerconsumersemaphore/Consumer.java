package producerconsumersemaphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;

public class Consumer implements Runnable {
    Queue<Object> store;
    int maxSize;
    String name;
    Semaphore producerSemaphore;
    Semaphore consumerSemaphore;
    Lock lock;
    Consumer(Queue<Object> store, int maxSize, String name, Semaphore producerSemaphore, Semaphore consumerSemaphore, Lock lock) {
        this.store = store;
        this.maxSize = maxSize;
        this.name = name;
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
        this.lock = lock;
    }
    @Override
    public void run() {
        while (true) {//Infinite number of consumer are available.
            try {
                consumerSemaphore.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            lock.lock();
            if (store.size() > 0) {
                System.out.println(name + " is removing the object, size = " + store.size());
                store.remove();
            }
            lock.unlock();
            producerSemaphore.release();
        }
    }
}
