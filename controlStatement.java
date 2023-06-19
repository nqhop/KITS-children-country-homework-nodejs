public class controlStatement {

    // 1. Cho thang điểm từ 0 - 100, sinh viên được xếp hạng dựa trên thứ tự
    // 0 <= score <= 100
    static void evalute(int score) {
        char scoreStr = 'E';
        if (score >= 80 && score <= 100)
            scoreStr = 'A';
        else if (score >= 60 && score <= 79)
            scoreStr = 'B';
        else if (score >= 40 && score <= 59)
            scoreStr = 'C';
        else if (score >= 20 && score <= 39)
            scoreStr = 'D';
        System.out.println("score: " + scoreStr);
    }

    // 2. Tạo 1 method so sánh 2 số nguyên, trả về -1 nếu a < b, trả về 0 nếu a == b
    // và 1 nếu a > b
    static int compare(int a, int b) {
        // if(a < b) return -1;
        // if(a > b) return 1;
        // return 0;

        return (a < b) ? -1 : (a > b) ? 1 : 0;
    }

    // 3. Tạo 1 method nhận vào 1 số nguyên dương, số này tương ứng với năm (year),
    // trả về 1 nếu số này thuộc về năm nhuận và 0 nếu ngược lại
    static int isLeapYear(int year) {
        return (year % 4 == 0) ? 1 : 0;
    }

    // 4. Tạo hàm nhập và 1 số nguyên, in ra tất cả các số chẵn bắt đầu từ 0
    static void printEven(int n) {
        for (int i = 2; i < n; i += 2)
            System.out.print(i + " ");
    }

    // 5. Vẽ kim tự tháp: Tạo hàm nhập vào số n, in ra kim tự tháp có n tầng
    static void pyramid(int n) {
        System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(i);
            System.out.println();
        }
    }
    // another approach
    // StringUtils.repeat('e', 3)  = "eee"

    // 6. Nhân 2 ma trận 2x2
    static int[][] mul(int[][] x, int[][] y) {
        int length = x.length;
        int[][] result = new int[length][length];
        for (int i = 0; i < length; i++)
            for (int j = 0; j < length; j++)
                for (int z = 0; z < length; z++)
                    result[i][j] += x[j][z] * y[z][j];
        return result;
    }

    public static void main(String[] args) {
        evalute(88);
        System.out.println("compare " + compare(4,5));
        System.out.println("is leap year " + isLeapYear(2023));
        printEven(9);
        pyramid(5);

        int[][] mulArr = mul(new int[][] { { 1, 2 }, { 1, 2 } }, new int[][] { { 2, 1 }, { 2, 1 } });
        for (int[] row : mulArr) {
            for (int number : row) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
