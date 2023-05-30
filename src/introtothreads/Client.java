package introtothreads;

public class Client {

    public static void doSomething() {
        System.out.println("Doing something, Printed by : " + Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        System.out.println("Hello Threads. Printed by : " + Thread.currentThread().getName());


        HelloWorldPrinter printer = new HelloWorldPrinter();
        Thread thread = new Thread(printer); ///Passing task to thread which it will have to run.
        thread.start();

        Thread thread1 = new Thread(printer); ///Passing task to thread which it will have to run.
        thread1.start();

        doSomething();
    }
}

// Q: Print Hello World in a different thread.


// 1. Identify all the Tasks -> Print Hello World.
// 2. Create a class for each task.
// 3. Make this class implement Runnable interface.
// 4. Implement run() method -> Write the code in the run() method,
// that you want to execute in a different thread.
// 5. Create a thread object from where you want to run the task in a different thread,
// and pass the object of the task to it.
// 6. start the thread.
