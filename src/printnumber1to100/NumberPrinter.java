package printnumber1to100;

public class NumberPrinter implements Runnable {
    private int numberToPrint;

    public NumberPrinter(int numberToPrint) {
        this.numberToPrint = numberToPrint;
    }

    @Override
    public void run() {
        System.out.println("Printed " + numberToPrint + " by thread : " + Thread.currentThread().getName());
    }
    //Task to print a single number.
}
