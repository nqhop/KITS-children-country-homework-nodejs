import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class CollectionExercise {

    // Bài 1: Sử dụng ít nhất 3 cách khác nhau để loop qua 1 ArrayList
    // Gợi ý:
    // Sử dụng for-index
    // Sử dụng while hoặc do-while (tìm hiểu về Iterator)
    // Sử dụng hàm forEach trong Java Stream
    // Sử dụng for-each
    public static void loopArrayList(List<Integer> arr) {
        System.out.println("Loop use for-index");
        for (int i = 0; i < arr.size(); i++)
            System.out.print(arr.get(i) + " ");

        System.out.println("\nloop use while (Iterator)");
        Iterator<Integer> it = arr.iterator();
        while (it.hasNext())
            System.out.print(it.next() + " ");

        System.out.println("\nloop use forEach in java stream");
        // arr.stream().forEach(y -> System.out.print(y + " "));
        arr.stream().forEach(System.out::println);

        System.out.println();
    }

    // Bài 2: Viết hàm cho phép lấy phần tử đầu và cuối của 1 ArrayList cho trước

    public static String takeFirst(List<String> arr) {
        return arr.get(0);
    }

    public static String takeLast(List<String> arr) {
        return arr.get(arr.size() - 1);
    }

    // Bài 3: Viết hàm cho phép insert vào mảng ArrayList cho trước ở đầu và cuối

    public static void insertHead(List<String> arr, String item) {
        arr.add(0, item);
    }

    public static void insertTail(List<String> arr, String item) {
        arr.add(arr.size(), item);
    }

    // Bài 4: Viết hàm cho phép chuyển toàn bộ nội dung của 1 Array sang 1 Array còn
    // lai
    public static void migrate(List<String> left, List<String> right) {
        right.addAll(left);
        left.clear();
    }

    // Bài 5: Viết hàm biến đổi các ký tự của 1 Array thành vị trí của chính nó
    public static void transform(List<String> arr) {
        System.out.println("Array List before transform: " + arr);

        for (int i = 0; i < arr.size(); i++) {
            arr.set(i, String.valueOf(i));
        }

        System.out.println("Array List after transform: " + arr);
    }

    public static void main(String[] args) {

        // Bai 1
        loopArrayList(List.of(1, 2, 3, 4, 5));
        // bai 2
        List<String> arr01 = new ArrayList<String>(List.of("a", "b", "c"));
        List<String> arr02 = new ArrayList<String>(List.of("a"));
        System.out.println("2. First element: " + takeFirst(arr01) + ", Last element: " + takeLast(arr01));
        System.out.println("2. First element: " + takeFirst(arr02) + ", Last element: " + takeLast(arr02));

        // bai 3
        List<String> arr03 = new ArrayList<String>(List.of("mid"));
        insertHead(arr03, "head");
        insertTail(arr03, "tail");
        System.out.println(arr03);

        // demo
        List<String> arr001 = new ArrayList<String>();
        ArrayList<String> arr002 = new ArrayList<String>();
        LinkedList<String> arr003 = new LinkedList<String>();

        // accepCollection(arr001);
        // accepCollection(arr002);
        // accepCollection(arr003);

        // accepCollection1(arr001);
        // accepCollection1(arr002);
        // accepCollection1(arr003);
    }

    static void accepCollection(List<String> list) {
    }
    static void accepCollection1(ArrayList<String> list) {
    }
}
