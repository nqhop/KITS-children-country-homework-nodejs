import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionExample {
    public static void main(String[] args) {
        // create a collection (ArrayList) of intergers
        List<Integer> numbers = new ArrayList<>();

        // ad elements to the collection
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(80);
        numbers.add(0);
        numbers.add(40);
        numbers.add(20);
        numbers.add(50);

        // get the size of the collection
        int size = numbers.size();
        System.out.println("Size of the collection: " + size);

        // check if the collection is empty
        boolean isEmpty = numbers.isEmpty();
        System.out.println("Is the collection empty? " + isEmpty);

        // Iterate over the elements in the collection
        System.out.println("Elements in the collection:");
        for(int number : numbers)
            System.out.print(number + " ");

        // Remove an elements from the collection
        Integer removed = numbers.remove(2);
        System.out.println("Is 20 removed? " + removed);

        // sort list in ascending order
        Collections.sort(numbers);
        System.out.println("Sorted list (ascending): " + numbers);

        // Reverse the order of the list
        Collections.reverse(numbers);
        System.out.println("Reversed list: " + numbers);

        // shuffle the elements in the list
        Collections.shuffle(numbers);
        System.out.println("Shuffle: " + numbers);

        // find the minimum and maximun elements in the list
        Integer min = Collections.min(numbers);
        Integer max = Collections.max(numbers);
        System.out.println("Minimum element: " + min + "m Maximun: " + max);

        // Replace all occorences of a specific element in the list
        Collections.replaceAll(numbers, 50, 9);
        System.out.println("List after replacing: " + numbers);
    }
}