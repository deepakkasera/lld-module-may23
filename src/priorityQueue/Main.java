package priorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    public static class Car implements Comparable<Car> {
        int speed;
        int power;
        String name;

        Car(int speed, int power, String name) {
            this.speed = speed;
            this.power = power;
            this.name = name;
        }

        @Override
        public int compareTo(Car other) {
            return this.speed - other.speed; // < 0
        }
    }

    public static class CarSpeedComparator implements Comparator<Car> {

        @Override
        public int compare(Car o1, Car o2) {
            return o1.speed - o2.speed;
        }
    }

    public static class CarPowerComparator implements Comparator<Car> {

        @Override
        public int compare(Car o1, Car o2) {
            return o1.power - o2.power;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(10);
        priorityQueue.add(20);
        priorityQueue.add(5);
        priorityQueue.add(7);
        priorityQueue.add(8);
        priorityQueue.add(3);

//        while (priorityQueue.size() > 0) {
//            System.out.println(priorityQueue.peek());
//            priorityQueue.remove();
//        }

        PriorityQueue<Car> pq = new PriorityQueue<>();
        pq.add(new Car(100, 78, "A"));
        pq.add(new Car(200, 100, "B"));
        pq.add(new Car(150, 780, "C"));
        pq.add(new Car(400, 20, "D"));
        pq.add(new Car(70, 150, "E"));
        pq.add(new Car(175, 200, "F"));

//        while (pq.size() > 0) {
//            System.out.println("speed: " + pq.peek().speed + ", power: " +
//                    pq.peek().power + ", name: " + pq.peek().name);
//            pq.remove();
//        }


        PriorityQueue<Car> pq1 = new PriorityQueue<>(new CarPowerComparator());
        pq1.add(new Car(100, 78, "A"));
        pq1.add(new Car(200, 100, "B"));
        pq1.add(new Car(150, 780, "C"));
        pq1.add(new Car(400, 20, "D"));
        pq1.add(new Car(70, 150, "E"));
        pq1.add(new Car(175, 200, "F"));

//        while (pq1.size() > 0) {
//            System.out.println("speed: " + pq1.peek().speed + ", power: " +
//                    pq1.peek().power + ", name: " + pq1.peek().name);
//            pq1.remove();
//        }

        PriorityQueue<Car> pq2 = new PriorityQueue<>(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                if (o1.speed == o2.speed) {
                    return o2.power - o1.power;
                } else {
                    return o1.speed - o2.speed;
                }
            }
        });
        pq2.add(new Car(100, 78, "A"));
        pq2.add(new Car(200, 100, "B"));
        pq2.add(new Car(150, 780, "C"));
        pq2.add(new Car(400, 20, "D"));
        pq2.add(new Car(70, 150, "E"));
        pq2.add(new Car(175, 200, "F"));
        pq2.add(new Car(175, 300, "G"));

        while (pq2.size() > 0) {
            System.out.println("speed: " + pq2.peek().speed + ", power: " +
                    pq2.peek().power + ", name: " + pq2.peek().name);
            pq2.remove();
        }
    }
}
