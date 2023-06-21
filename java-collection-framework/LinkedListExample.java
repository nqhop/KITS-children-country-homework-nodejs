import java.util.LinkedList;
public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();

        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        System.out.println("Size of the LinkedList: " + names.size());

        // access elements in the LinkedList
        String first = names.getFirst();
        String last = names.getLast();
        System.out.println("First element: " + first);
        System.out.println("Last element: " + last);

        // Modify elements in the linkedList
        names.set(1, "Eve");
        System.out.println("Modified LinkedList: " + names);

        // iterate over the elements in hte LinkedList
        System.out.println("elements in the LinkedList");
        for(String name : names)
            System.out.println(name + " ");

        // remove an element
        boolean removed = names.remove("Alice");

        // check if the LinkedList contains a specific element
        boolean contains = names.contains("Bob");

        // clear all
        names.clear();
    }
}
