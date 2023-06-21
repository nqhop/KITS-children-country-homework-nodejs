import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();
        studentMap.put("Alice", 1001);
        studentMap.put("Bob", 1002);
        studentMap.put("Charlie", 1003);

        System.out.println("Size of the HashMap: " + studentMap.size());

        System.out.println("Alice'ID : " + studentMap.get("Alice"));

        System.out.println("Does the HashMap contain key 'Bob': " + studentMap.containsKey("Alice"));

        System.out.println("Does the HashMap contain value 1004? " + studentMap.containsValue(1004));

        System.out.println("Entries in the HashMap");
        for(Map.Entry<String, Integer> entry : studentMap.entrySet()){
            System.out.println("Name: " + entry.getKey() + ", ID: " + entry.getValue());
        }

        // remove an entry from the hashMap

        // clear all entries from the hashMap

    }
}
