class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    // 1. chia 2 so
    public float devide(int a, int b) {
        if (b == 0) {
            return 0;
        }
        return (float) a / b;
    }

    // 2. lấy ký tự đầu tiên trong 1 string
    public String firstCharInString(String str) {
        return (str == "") ? "" : str.charAt(0) + "";
    }

    // 3. kiểm tra 1 só có chẵn hong
    public boolean checkEven(int n) {
        return (n % 2 == 0) ? true : false;
    }

    // 4. Tính tổng 2 số short
    public int sumOfShortType(short a, short b) {
        return a + b;
    }

    // 5. tính factorial (nhập số nguyên)
    public long factorial(int n) {
        long s = 1;
        for (int i = 1; i <= n; i++)
            s *= i;
        return s;
    }

    // 6. Tính trung bình cộng
    public float average(int[] a) {
        int s = 0;
        for(int i : a) s+= i;
        return (float) s / a.length;
    }

    // 7. tìm max của 2 số (truyền vào kiểu Integer)
    public Integer findMaxOfTwoNumber(Integer a, Integer b) {
        return (a > b) ? a : b;
    }

    // 8. tính cạnh huyền của 2 tam giác vuông
    public double hypotenuseOfRightTriangle(double a, double b) {
        return (a <=0 || b <= 0) ? 0 : Math.sqrt(a * a + b * b);
    }

    // 9. lấy giá trị cuối của 1 string
    public String lastCharOfString(String str) {
        return (str == "") ? "" : str.charAt(str.length() - 1) + "";
    }

    // 10.1 vẽ tam giác cân use nested loop
    public void isoscelesTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= 1; j--)
                System.out.print((j > i) ? ' ' : '*');
            for (int j = 2; j <= n; j++)
                System.out.print((j > i) ? ' ' : '*');
            System.out.println();
        }
    }

    // 10.2 vẽ tam giác cân use repeat
    public void isoscelesTriangleUseRepeat(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(" ".repeat(n - i));
            System.out.print("*".repeat(i + i - 1));
            System.out.print(" ".repeat(n - i));
            System.out.println();
        }
    }
}