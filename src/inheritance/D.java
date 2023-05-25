package inheritance;

public class D extends C {
    D() {
        super("Hello"); // super should be the first line of code in the child constructor.
        System.out.println("Constructor of D");
    }

}


// DONE - Thank You.


// A <- B <- C <- D
