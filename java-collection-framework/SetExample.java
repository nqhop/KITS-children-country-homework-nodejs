import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        // create hashset
        Set<String> fruits = new HashSet<>();

        // add elements to the set
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple");

        // get the size of the set
        System.out.println("Size of the set: " + fruits.size());

        // check if an element exists in the set
        System.out.println("Does the set contain 'apple': " + fruits.contains("Apple"));

        // iterate over the elements in the set
        for(String fruit : fruits)
            System.out.print(fruit + " ");

        // remove an element from the set
        

        // clear all elements from the set
    }
}
