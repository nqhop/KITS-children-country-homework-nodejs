import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Iterator;

class Collection20Exercise {

    // 1. Tạo một ArrayList chứa các số nguyên và tính tổng của tất cả các phần tử.
    public static void sumArrayList(List<Integer> arr) {
        int sum = 0;
        for (Integer number : arr)
            sum += number;
        System.out.println("B1. sum: " + sum);
    }

    // 2. Viết một chương trình để tạo một HashSet từ một ArrayList.
    public static void createHashSetFromArrayList(List<Integer> arr) {
        HashSet<Integer> hashSetArr = new HashSet(arr);
        System.out.println("B2. create hashSet from ArrayList " + hashSetArr);
    }

    // 3. Tạo một LinkedList chứa các chuỗi và đảo ngược thứ tự của các phần tử
    // trong danh sách.
    public static void reverseLinkedList(LinkedList<String> arr) {
        Iterator x = arr.descendingIterator();
        System.out.println("\nB3. reverse LinkedList");

        // print list with descending order
        while (x.hasNext()) {
            System.out.print(x.next() + " ");
        }
    }

    // 4. Viết một phương thức để tìm phần tử lớn nhất trong một ArrayList.
    public static void maxInArrayList(List<Integer> arr) {
        int max = Collections.max(arr);
        System.out.println("\nB4. max in Arraylist: " + max);
    }

    // 5. Tạo một HashMap chứa các tên và điểm số của sinh viên và in ra tất cả các
    // mục.
    public static void nameAndScoreOfStudent(HashMap<String, Float> arr) {
        // System.out.println("B5. student " + arr);
        for (Map.Entry<String, Float> entry : arr.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    // 6. Viết một phương thức để kiểm tra xem một ArrayList có chứa một giá trị cụ
    // thể hay không.
    public static void containInArrayList(List<Integer> arr, int n) {
        System.out.println("B6. " + n + " in ArrayList? " + (arr.contains(n)));
    }

    // 7. Sắp xếp một ArrayList chứa các chuỗi theo thứ tự bảng chữ cái.
    public static void sortArrayList(List<Character> arr) {
        Collections.sort(arr);
        System.out.println("B7. sort " + arr);
    }

    // 8. Tạo một TreeSet từ một ArrayList và in ra tất cả các phần tử theo thứ tự
    // tăng dần.
    public static void createTreeSetFromArrayList(List<Integer> arr) {
        Set<Integer> treeSet = new TreeSet<>(arr);
        System.out.println("B8. create treeset from arrayList\n" + treeSet);
    }

    // 9. Viết một chương trình để thêm tất cả các phần tử của một ArrayList vào một
    // HashSet.
    public static void addFromArrayListToHashSet(List<Integer> arr, HashSet<Integer> arr2) {
        arr.addAll(arr2);
        System.out.println("\nB9. add ArrayList to Hashset " + arr);
    }

    // 10. Xóa các phần tử trùng lặp từ một ArrayList.
    public static void removeDuplicateFromArrayList(List<Integer> arr) {
        arr = new ArrayList<Integer>(new HashSet<Integer>(arr));
        System.out.println("\nb10. remove duplicate " + arr);
    }

    // 11. Viết một phương thức để sao chép một ArrayList sang một ArrayList mới.
    public static void coppyArrayList(List<Integer> arr) {
        List<Integer> arr2 = new ArrayList<>();
        arr2.addAll(arr);
        System.out.println("11. new arrayList " + arr2);
    }

    // 12. Tạo một TreeMap chứa các từ và tần suất xuất hiện của chúng trong một đoạn văn bản.
    public static void frequencyInTreeMap(TreeMap<String, Integer> arr, String text){
        
    }

    // 13. Tìm số lần xuất hiện của một phần tử cụ thể trong một LinkedList.
    // 14. Kiểm tra xem một ArrayList có rỗng hay không.
    // 15. Viết một phương thức để chèn một phần tử vào một ArrayList tại vị trí xác định.
    // 16. Tạo một PriorityQueue từ một ArrayList và in ra tất cả các phần tử theo thứ tự ưu tiên.

    // 17. Viết một chương trình để kiểm tra xem một ArrayList có chứa tất cả các
    // phần tử của một danh sách khác hay không.
    public static void checkArrayListContainAllElementOtherInList(List<Integer> arr, List<Integer> arr2) {
        for(Integer number : new HashSet<>(arr2))
            if (arr.contains(number))
                continue;
            else{
                System.out.println("ArrayList not contain all element of other ArrayList");
                return;
            }
        System.out.println("ArrayList contain all element of other ArrayList");
    }

    // 18. Sắp xếp một LinkedList chứa các số nguyên theo thứ tự giảm dần.
    // 19. Tạo một HashSet từ một mảng và in ra tất cả các phần tử.
    // 20. Viết một phương thức để lấy phần tử đầu tiên và phần tử cuối cùng của một ArrayList.
    public static void main(String[] args) {
        List<Integer> arr01 = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        LinkedList<String> arr02 = new LinkedList<>(List.of("a", "b", "c", "d", "e"));
        List<Character> arr03 = new ArrayList<>(List.of('d', 'e', 'c', 'a', 'b'));
        List<Integer> arr04 = new ArrayList<>(List.of(7, 2, 5, 1, 4, 3, 6));
        HashSet<Integer> arr05 = new HashSet<Integer>(List.of(6, 7, 8, 9));
        List<Integer> arr06 = new ArrayList<>(List.of(2, 1, 1, 2, 3, 4, 5));

        HashMap<String, Float> students = new HashMap<>();
        students.put("John", 8.9f);
        students.put("Lisa", 9.0f);
        students.put("Jack", 8.5f);
        
        switch (Integer.parseInt(args[0])) {
            case 1:
                sumArrayList(arr01);
                break;
            case 2:
                createHashSetFromArrayList(arr01);
                break;
            case 3:
                reverseLinkedList(arr02);
                break;
            case 4:
                maxInArrayList(arr01);
                break;
            case 5:
                nameAndScoreOfStudent(students);
                break;
            case 6:
                containInArrayList(arr01, 4);
                break;
            case 7:
                sortArrayList(arr03);
                break;
            case 8:
                createTreeSetFromArrayList(arr04);
                break;
            case 9:
                addFromArrayListToHashSet(arr01, arr05);
                break;
            case 10:
                removeDuplicateFromArrayList(arr06);
                break;
            case 17:
                checkArrayListContainAllElementOtherInList(arr01, arr06);
                break;

        }

        // == vs equalts
        System.out.println("a".equals("a"));
        System.out.println(new String("a") == new String("a"));
    }
}