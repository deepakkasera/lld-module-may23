package producerconsumerproblemusingsemaphore;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Semaphore;

public class Client {
    public static void main(String[] args) {
        int maxSize = 3;
        Queue<Object> store = new ConcurrentLinkedQueue<>();

        Semaphore producerSemaphore = new Semaphore(maxSize);
        Semaphore consumerSemaphore = new Semaphore(0);

        Producer p1 = new Producer(store, maxSize, "p1", producerSemaphore, consumerSemaphore);
        Producer p2 = new Producer(store, maxSize, "p2", producerSemaphore, consumerSemaphore);
        Producer p3 = new Producer(store, maxSize, "p3", producerSemaphore, consumerSemaphore);

        Consumer c1 = new Consumer(store, maxSize, "c1", producerSemaphore, consumerSemaphore);
        Consumer c2 = new Consumer(store, maxSize, "c2", producerSemaphore, consumerSemaphore);
        Consumer c3 = new Consumer(store, maxSize, "c3", producerSemaphore, consumerSemaphore);

        Thread t1 = new Thread(p1);
        t1.start();

        Thread t2 = new Thread(p2);
        t2.start();

        Thread t3 = new Thread(p3);
        t3.start();

        Thread t4 = new Thread(c1);
        t4.start();

        Thread t5 = new Thread(c2);
        t5.start();

        Thread t6 = new Thread(c3);
        t6.start();
    }
}


//Producer Consumer Problem :

/*
Store of shirts.
Producer will be constantly producing the shirts till there's a free slot available in the STORE.
Consumer will be constantly buying the shirts if there's a shirt available in the STORE.

STORE is the critical section.

Producers and Consumers can work in parallel in different threads.
MAX_SIZE = 3
if (store.size() < MAX_SIZE) {
    //producer can produce the shirt
    store.add(new Shirt()); P1, P2
}

//It is leading to inconsistency and Sync issue.

How to solve Sync issue ? - MUTEX or synchronised keyword.

MUTEX - It allows only thread to enter inside the CS at any given point of time.

IMPORTANT QUESTION :- Can we control the order of threads ? NO

Q: Is MUTEX or synchronised keyword solving the Synchronisation problem ? YES

lock(); P1, P2, P3, P4 ......
if (store.size() < MAX_SIZE) {
    //producer can produce the shirt
    store.add(new Shirt());
}
unlock();


Q: IS MUTEX or synchronised keyword fast enough ? NO.

Optimization- we should allow multiple producers and multiple consumers inside the STORE,
depending on the number of slots.

number of producers in the STORE (x) = number of free slots.
number of consumers in the STORE (y) = number of occupied slots.

x + y = SIZE OF THE STORE.

Semaphores :- Think of Semaphore as an integer variable.

Initially - STORE is empty.
MAX_SIZE = 3;
number of free slots = 3

Number of producers allowed = 3;
Number of consumers allowed = 0;

//WE CAN'T CONTROL THE ORDER OF THE THREADS.

STORE - 3 slots are empty;
producerSemaphore = 3;
consumerSemaphore = 0;

P1 -> store.add(Shirt); producerSemaphore = 2, consumerSemaphore = 1.
either producer can come or consumer can come in the store.

P2 -> store.add(Shirt); producerSemaphore = 1, consumerSemaphore = 2.

C1 -> store.buy(), producerSemaphore = 2, consumerSemaphore = 1;

P3 -> store.add(Shirt); producerSemaphore = 1, consumerSemaphore = 2.

P4 -> store.add(Shirt); producerSemaphore = 0, consumerSemaphore = 3.

C2 -> store.buy(), producerSemaphore = 1, consumerSemaphore = 2.

Semaphore -
1. Integer variable.
2. SIGNAL mechanism.
3. Semaphore === Integer variable + locking mechanism.


Semaphore s = new Semaphore(x);
x number of threads can be present inside the CS at any point of time
x > 1

if x == 1 -> Semaphore will act like a MUTEX.
 */

/*
Reason of removing if condition from Producer and Consumer :-
size = 0;
ps = 3;
cs = 0;

ps = 0;
ps.acquire() (this will only be executed iff ps > 0) -> This call will block is ps = 0;
-> size = 2; ps = 1, cs = 2;
-> trying to add
add to the store

 */