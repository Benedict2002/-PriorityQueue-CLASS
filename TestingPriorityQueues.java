import java.util.PriorityQueue;

public class TestingPriorityQueues {
    public static void main(String[] args) {
        // Create a priority queue to hold strings
        PriorityQueue<String> pq = new PriorityQueue<>();

        // Add elements to the priority queue
        pq.add("FR");
        pq.add("DE");
        pq.add("GB");
        pq.add("IT");
        pq.add("ES");

        // Remove and print elements in priority order
        System.out.println("Elements in priority order:");
        while (!pq.isEmpty()) {
            System.out.print(pq.remove() + " ");
        }
    }
}
