import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        // create a List of strings
        List<String> fruits = new ArrayList<>();
        // add elements to the list
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        // Get the size of the list
        int size = fruits.size();
        System.out.println("Size of te list : " + size);

        // assess elements in the list
        String firstFruit = fruits.get(0);
        System.out.println("First fruit: " + firstFruit);

        // Modify elements in the list
        fruits.set(1, "Mango");
        System.out.println("Modified list: " + fruits);

        // iterate over the elemnts in the list
        System.out.println("elements in the list: ");
        for(String fruit : fruits)
            System.out.print(fruit + " ");
        
        // remove an elements from the list
        boolean removed = fruits.remove("Orange");
        System.out.println("Is 'orange' removed? " + removed);

        // check if the list contains a specific elements (contains)
        System.out.println("Does the list contain 'Banana'? " + fruits.contains("Banana"));

        // clear all elements from the list (clear)
        fruits.clear();
        System.out.println("Size og the List after clearing: " + fruits.size());


    }
}
