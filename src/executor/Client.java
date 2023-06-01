package executor;

import executor.NumberPrinter;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        //ExecutorService executor = Executors.newFixedThreadPool(10);
        //thread pool size = 10

        ExecutorService executor = Executors.newCachedThreadPool();

        for (int i = 1; i <= 100; i++) {
            if (i == 80 || i == 90 || i == 99) {
                System.out.println("DEBUG");
            }
            NumberPrinter printer = new NumberPrinter(i);
            executor.execute(printer);
        }

        executor.shutdown();
    }
}
