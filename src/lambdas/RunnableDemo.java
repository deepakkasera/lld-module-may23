package lambdas;

public class RunnableDemo {
    public static void main(String[] args) {

        //Way1 : Anonymous Class.
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Printed by " + Thread.currentThread().getName());
            }
        };
        //System.out.println("Printed by " + Thread.currentThread().getName());
        //Thread t = new Thread(runnable);
        //t.start();

        //Using Lambda
        Runnable runnable1 = () -> {
            System.out.println("Printed by " + Thread.currentThread().getName());
        };
        System.out.println("Printed by " + Thread.currentThread().getName());
        Thread thread = new Thread(runnable1);
        thread.start();

        Thread thread1 = new Thread(() -> {
            System.out.println("Printed by " + Thread.currentThread().getName());
        });
        thread1.start();;

    }
}
