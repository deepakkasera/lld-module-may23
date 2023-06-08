package producerconsumer;

import java.util.Queue;
import java.util.concurrent.locks.Lock;

public class Consumer implements Runnable {
    Queue<Object> store;
    int maxSize;
    String name;

    Lock lock;

    Consumer(Queue<Object> store, int maxSize, String name, Lock lock) {
        this.store = store;
        this.maxSize = maxSize;
        this.name = name;
        this.lock = lock;
    }
    @Override
    public void run() {
        while (true) {//Infinite number of consumer are available.
            lock.lock();
            if (store.size() > 0) {
                System.out.println(name + " is removing the object, size = " + store.size());
                store.remove();
            }
            lock.unlock();
        }
    }
}
