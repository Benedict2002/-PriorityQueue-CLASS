import java.util.PriorityQueue;

public class TestingPriorityQueues {
    public static void main(String[] args) {
        // Create a priority queue to hold Student objects
        PriorityQueue<Student> pq = new PriorityQueue<>();

        // Add Student objects to the priority queue
        pq.add(new Student("Ann", 44));
        pq.add(new Student("Bob", 99));
        pq.add(new Student("Cal", 33));
        pq.add(new Student("Don", 66));

        // Remove and print Student objects in priority order
        System.out.println("Students in priority order:");
        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }
    }
}

class Student implements Comparable<Student> {
    private String name;
    private int credits;

    // Constructor
    public Student(String name, int credits) {
        this.name = name;
        this.credits = credits;
    }

    // Implement the compareTo method for priority comparison
    @Override
    public int compareTo(Student that) {
        return Integer.compare(this.credits, that.credits);
    }

    // Override the toString method for readable output
    @Override
    public String toString() {
        return String.format("%s(%d)", name, credits);
    }
}
