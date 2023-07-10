package designpatterns.strategy;

public class CarPathCalculator implements PathCalculatorStrategy {
    @Override
    public void findPath(String fromLocation, String toLocation) {
        System.out.println("Car Path");
    }
}
