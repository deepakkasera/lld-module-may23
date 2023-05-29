package interfaces;

public interface Animal {
    //Interfaces can only have static final attributes.
    //All the methods and attributes of an interface are public by default.

    void eat();

    void walk();

    void run();

    //JAVA 8 : default methods in interface.
    default void sleep() {
        System.out.println("Animal is sleeping");
    }
}
