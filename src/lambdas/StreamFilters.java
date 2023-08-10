package lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamFilters {

    public static class Car {
        int speed;
        int power;
        int price;

        Car(int speed, int power, int price) {
            this.speed = speed;
            this.power = power;
            this.price = price;
        }

        @Override
        public String toString() {
            return "[Speed: " + this.speed + ", Power: " + this.power + ", Price: " + this.price + "]\n";
        }
    }
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 5, 3, 2, 6, 8, 10, 9, 7, 15);

        //Task -> Get all the odd numbers from the list.
        List<Integer> oddNumbers = new ArrayList<>();
        for (int x : list) {
            if (x%2 != 0) oddNumbers.add(x);
        }
        //System.out.println(oddNumbers);

        //How to do above task using Streams.
        Stream<Integer> stream = list.stream();
//        Predicate<Integer> predicate = new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                return integer % 2 == 1;
//            }
//        };
        Predicate<Integer> predicate = (x) -> x % 2 == 0;
        //System.out.println(stream.filter(predicate).toList());

        //System.out.println(list.stream().filter((x) -> (x & 1) == 0).toList());

        /*
        Steps :-
            1. List converted to a Stream.
            2. Stream will loop over all the elements in the list.
            3. Stream will pass every element to the filter.
            4. Lambda condition will be applied over element which was passed inside the filer.
            5. If the condition returns true for an element, it will be added in the output else not.
         */

        CarDemoUsingLambda.Car c1 = new CarDemoUsingLambda.Car(100, 250, 1000);
        CarDemoUsingLambda.Car c2 = new CarDemoUsingLambda.Car(400, 600, 4000);
        CarDemoUsingLambda.Car c3 = new CarDemoUsingLambda.Car(80, 7000, 500);
        CarDemoUsingLambda.Car c4 = new CarDemoUsingLambda.Car(600, 900, 5000);
        CarDemoUsingLambda.Car c5 = new CarDemoUsingLambda.Car(50, 20, 100);
        CarDemoUsingLambda.Car c6 = new CarDemoUsingLambda.Car(300, 450, 2500);

        List<CarDemoUsingLambda.Car> cars = Arrays.asList(c1, c2, c3, c4, c5);

        List<Integer> carPrices = cars.stream().map(car -> car.price).toList();
        //System.out.println(carPrices);

        System.out.println(cars.stream().filter(car -> car.price > 1000).toList());

        System.out.println(cars.stream().map(car -> car.price > 1000).toList());
    }
}
