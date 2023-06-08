package producerconsumer;

import java.util.Queue;
import java.util.concurrent.locks.Lock;

public class Producer implements Runnable {
    Queue<Object> store;
    int maxSize;

    String name;

    Lock lock;

    Producer(Queue<Object> store, int maxSize, String name, Lock lock) {
        this.store = store;
        this.maxSize = maxSize;
        this.name = name;
        this.lock = lock;
    }
    @Override
    public void run() {
        while (true) {//Infinite number of producers are available.
            lock.lock();
            if (store.size() < maxSize) {
                System.out.println(name + " is adding the object, size = " + store.size());
                store.add(new Object());
            }
            lock.unlock(); //releasing the lock manually.
        }
    }
}
