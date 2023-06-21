import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> studentIds = new HashMap<>();

        studentIds.put("John", 101);
        studentIds.put("Alice", 102);
        studentIds.put("Bob", 103);

        System.out.println("Size og the map: " + studentIds.size());

        System.out.println("John's ID: " + studentIds.get("John"));

        System.out.println("Does the map contain Alice? " + studentIds.containsKey("Alice"));

        System.out.println("Elements in the map");
        for(Map.Entry<String, Integer> entry : studentIds.entrySet()){
            String name = entry.getKey();
            int id = entry.getValue();
            System.out.println("name: " + name + ", ID " + id);
        }

        // remove an element from the map
        Integer removedId = studentIds.remove("Bob");
        System.out.println("removed ID " + removedId);
        System.out.println("Updated map: " + studentIds);

        // clear all elements from the map
        studentIds.clear();
        System.out.println("Size of the map adter clear: " + studentIds.size());
        
    }
}
