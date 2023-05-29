package methodoverriding;

public class Client {
    public static void main(String[] args) {
        A a = new A();
        a.doSomething("Scaler");

        a = new B();
        a.doSomething("Scaler");
        //a.doSomethingElse();

        B b = new B();
        b.doSomething("Scaler");

        B b1 = new B();
        b1.doSomethingElse();

        //B b1 = new A();
    }
}
