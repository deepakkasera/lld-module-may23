package lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CarDemoUsingLambda {
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
        Car c1 = new Car(100, 250, 1000);
        Car c2 = new Car(400, 600, 4000);
        Car c3 = new Car(80, 7000, 500);
        Car c4 = new Car(600, 900, 5000);
        Car c5 = new Car(50, 20, 100);
        Car c6 = new Car(300, 450, 2500);

        List<Car> cars = Arrays.asList(c1, c2, c3, c4, c5);

        //System.out.println(Collections.sort(cars));
//        Comparator<Car> speedComparator = (car1, car2) -> car2.power - car1.power;
//        Collections.sort(cars, speedComparator);
//        System.out.println(cars);

//        Collections.sort(cars, (car1, car2) -> car1.speed - car2.speed);
//        System.out.println(cars);

        Collections.sort(cars, (car1, car2) -> {
            return (car1.speed + car1.power) - (car2.speed + car2.power);
        });
        System.out.println(cars);
    }
}
