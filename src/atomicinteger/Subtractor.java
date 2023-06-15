package atomicinteger;

public class Subtractor implements Runnable{
    private Count count;

    Subtractor(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10000; i++) {
            count.value.addAndGet(-i);
        }
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
