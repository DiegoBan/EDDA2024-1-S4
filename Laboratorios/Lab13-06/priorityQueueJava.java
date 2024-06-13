import java.util.PriorityQueue;
import java.util.Comparator;

public class priorityQueueJava {
    static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return name + " (" + age + ")";
        }
    }
    public static void main(String[] args) {
        System.out.println("------naturalOrden------");
        PriorityQueue<Integer> naturalOrder = new PriorityQueue<>();
        naturalOrder.add(10);
        naturalOrder.add(20);
        naturalOrder.add(15);

        System.out.println("PriorityQueue en orden: ");
        while (!naturalOrder.isEmpty()) {
            System.out.println(naturalOrder.poll());
        }

        System.out.println("------ReverseOrder------");
        PriorityQueue<Integer> reverseOrder = new PriorityQueue<>(Comparator.reverseOrder());
        reverseOrder.add(10);
        reverseOrder.add(20);
        reverseOrder.add(15);

        System.out.println("PriorityQueue with reverse order: ");
        while (!reverseOrder.isEmpty()) {
            System.out.println(reverseOrder.poll());
        }

        System.out.println("------Class------");
        PriorityQueue<Person> personQueue = new PriorityQueue<>(Comparator.comparingInt(Person::getAge));
        personQueue.add(new Person("Alice", 30));
        personQueue.add(new Person("Bob", 25));
        personQueue.add(new Person("Charlie", 35));

        System.out.println("PriorityQueue con clase: ");
        while (!personQueue.isEmpty()) {
            System.out.println(personQueue.poll());
        }
    }
}