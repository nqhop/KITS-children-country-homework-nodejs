import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    // ---------Java Basic: String Challenges ----------

    // 1. Tìm các chữ cái trùng nhau có trong 1 chuỗi
    public static String[] dedupe(String str) {
        List<String> result = new ArrayList<String>();
        String[] strArr = str.split("");

        for (int i = 0; i < strArr.length - 1; i++) {
            int k = 0;
            boolean inResult = false;
            while (k < result.size()) {
                if (result.get(k).equals(strArr[i])) {
                    inResult = true;
                    break;
                } else
                    k++;
            }
            if (inResult)
                break;
            for (int j = i + 1; j < strArr.length; j++) {
                if (strArr[i].equals(strArr[j])) {
                    result.add(strArr[i]);
                    break;
                }
            }
        }
        String[] resultStringArr = result.toArray(new String[0]);
        return resultStringArr;
    }

    // 2. Tìm và trả về ký tự ở vị trí nhập vào
    public static char findChar(String str, int index) {
        return (index > str.length()) ? '-' : str.charAt(index - 1);
    }

    // 3. Tìm và thay thế {} trong chuỗi
    // we can use split, loop
    public static String replace(String str, String param) {
        return str.replace("{}", param);
    }

    public static String replace(String str) {
        return str;
    }

    // 4. Tạo hàm nhận vào không giới hạn 1 danh sách các String, trả về kết quả sau
    // khi nối chuỗi
    public static String joinStr(String delimiter, String... strs) {
        return String.join(delimiter, strs);
    }

    // ------------Java Basic: Array Challenges---------
    // 1. Tạo hàm nhận đầu vào là 1 chuỗi các số nguyên, trả ra mảng 2 chiều gồm 2
    // phần tử
    // Phần tử bên trái là chuỗi bao gồm các số chẵn
    // Phần tử bên phải là chuỗi bao gồm các số lẻ
    public static int[][] groupBy(int[] arr) {
        // List<ArrayList<Integer>> groupArr = new ArrayList<>(2);
        // for (int number : arr)
        // if (number % 2 == 0)
        // groupArr.get(0).add(number);
        // else
        // groupArr.get(1).add(number);
        // List<Integer[]> result = new ArrayList<>(2);
        // result.add(groupArr.get(0).toArray(new Integer[0]));
        // result.add(groupArr.get(1).toArray(new Integer[0]));
        // return result;
        List<Integer> evenList = new ArrayList<>();
        List<Integer> oddList = new ArrayList<>();
        for (int number : arr)
            if (number % 2 == 0)
                evenList.add(number);
            else
                oddList.add(number);
        int[][] result = new int[evenList.size()][oddList.size()];
        for (int i = 0; i < result[0].length; i++) {
            result[0][i] = (int) evenList.get(i);
        }
        for (int i = 0; i < result[1].length; i++) {
            result[1][i] = (int) oddList.get(i);
        }
        return result;
    }

    // -----------Java Basic: Exception Handling---------
    // 1. Chuyển các phần tử trong 1 mảng String sang kiểu Double, trả về mảng mới.
    // Nếu phần tử đó không phải là số, trả về số Octal của phần tử đó
    public static double[] convert(String[] numbers) {
        double[] numbersArr = new double[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            try {
                numbersArr[i] = (double) Double.parseDouble(numbers[i]);
            } catch (NumberFormatException e) {
                System.out.println(numbers[i]);
                numbersArr[i] = 0;
                for(char c : numbers[i].toCharArray())
                    numbersArr[i] += Integer.parseInt(Integer.toOctalString(c));
                System.out.println(Integer.toOctalString('a'));
            }
        }
        return numbersArr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(dedupe("abcabcabc")));
        System.out.println("2: " + findChar("Devera KITs", 6));
        System.out.println("3: " + replace("Local Host Server IP is {}", "127.0.0.1"));
        System.out.println("3: " + replace("{} love his dog, {} prepare to take him out for walking", "Nick"));
        System.out.println("3: " + replace("lorem isum"));
        System.out.println("4. " + joinStr("-", "a", "b", "c"));
        System.out.println("4. " + joinStr("", "a", "b", "c"));

        System.out.println("-------Array Challenges--------");
        int[][] arr1 = groupBy(new int[] { 1, 2, 3, 4 });
        for (int[] row : arr1) {
            for (int i : row)
                System.out.print(i + " ");
            System.out.println();
        }

        for (double d : convert(new String[] { "1.5", "2", "3", "ab", "a" }))
            System.out.print(d + " ");
    }
}