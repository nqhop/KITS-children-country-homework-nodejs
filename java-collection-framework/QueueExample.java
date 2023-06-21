import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("Apple");
        queue.add("Banana");
        queue.add("Orange");

        System.out.println("Size og the queue: " + queue.size());

        System.out.println("Is the queue empty: " + queue.isEmpty());

        // Access the element at the front of the queue without removing it
        System.out.println("front element of the queue: " + queue.peek());

        // Process elements in the queue (remove them)
        while(!queue.isEmpty()){
            String element = queue.poll();
            System.out.println("Processing element: " + element);
        }

        System.out.println("Size of the queue adter processing: " + queue.size());
    }
}
