public class exercise4 {
    public static void main(String[] args) {
        String str =  "java core";
        char[] charArr = str.toCharArray();
        System.out.println(charArr);

        String resultStr = String.copyValueOf(charArr);
        System.out.println("result Str:" + resultStr);
    }
}
