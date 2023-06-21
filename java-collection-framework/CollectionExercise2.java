import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;

public class CollectionExercise2 {

    // Bài 1: Viết hàm cho phép thêm ký tự vào đầu hoặc cuối của 1 LinkedList
    public static void insertHead(LinkedList<String> arr, String item) {
        arr.addFirst(item);
        // arr.add(0, item);
        for (String str : arr)
            System.out.print(str + " ");
        System.out.println();
    }

    public static void insertTail(LinkedList<String> arr, String item) {
        arr.addLast(item);
        for (String str : arr)
            System.out.print(str + " ");
        System.out.println();
    }

    // Bài 2: Viết hàm cho phép xóa ký tự tại 1 ví trí nhập vào
    public static void remove(LinkedList<String> arr, int index) {
        arr.remove(index);
        for (String str : arr)
            System.out.print(str + " ");
        System.out.println();
    }

    // Bài 3: Viết hàm cho phép chuyển toàn bộ dữ liệu của mảng bên trái qua phải
    public static List<String> migrate(LinkedList<String> left, ArrayList<String> right) {
        right.addAll( (right.isEmpty()) ? 0 : right.size(), left);
        left.clear();
        return right;
    }

    // Bài 4: Đảo ngược vị trí các phần tử trong 1 LinkedList
    public static List<String> reverse(LinkedList<String> arr) {
        return (List) arr.descendingIterator();
    }

    public static void main(String[] args) {

        System.out.println("Bai 1");
        LinkedList<String> arr1 = new LinkedList<String>(List.of("mid"));
        insertHead(arr1, "head");
        insertTail(arr1, "tail");

        System.out.println("Bai 2");
        LinkedList<String> arr2 = new LinkedList<String>(List.of("a", "b", "c"));
        remove(arr2, 0);
        remove(arr2, 1);

        System.out.println("Bai 3");
        LinkedList<String> left = new LinkedList<String>(List.of("a", "b", "c"));
        ArrayList<String> right = new ArrayList<String>();
        migrate(left, right);
        for (String str : right)
            System.out.print(str + " ");
        System.out.println();

        System.out.println("Bai 4");
        // LinkedList<String> arr4 = new LinkedList<String>(List.of("a", "b", "c"));            
        // for(String str : reverse(arr4))
        //     System.out.print(str + " ");

    }
}
