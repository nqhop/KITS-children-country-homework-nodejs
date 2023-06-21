import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(20);

        System.out.println("Size of the hashset: " + numbers.size());

        // interate over the elements in the hashset
        System.out.println("elements in the háhset");
        for(int number : numbers)
            System.out.print(number + " ");

        // remove an element from the hashset
        

        // check if the hashset contains a specific element

        // clear all elements from hashset
    }
}
