package priorityQueue;

import java.util.PriorityQueue;

public class Main {
    public static class Car {
        int speed;
        int power;
        String name;

        Car(int speed, int power, String name) {
            this.speed = speed;
            this.power = power;
            this.name = name;
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

        while (priorityQueue.size() > 0) {
            System.out.println(priorityQueue.peek());
            priorityQueue.remove();
        }

        PriorityQueue<Car> pq = new PriorityQueue<>();
        pq.add(new Car(100, 78, "A"));
        pq.add(new Car(200, 100, "B"));
        pq.add(new Car(150, 780, "C"));
        pq.add(new Car(400, 20, "D"));
        pq.add(new Car(70, 150, "E"));
        pq.add(new Car(175, 200, "F"));
    }
}
