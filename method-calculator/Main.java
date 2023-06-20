public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int result = calc.add(3, 4);
        System.out.println("Result: " + result);
        System.out.println("devide: " + calc.devide(7, 0));
        System.out.println("first char in string: " + calc.firstCharInString(""));
        System.out.println("check even: " + calc.checkEven(4));
        System.out.println("sum of short type: " + calc.sumOfShortType( (short) 32700, (short) 32700));
        System.out.println("factorial: " + calc.factorial(100));
        System.out.println("average: " + calc.average(new int[]{6, 4, 6, 2}) );
        System.out.println("find max of two number: " + calc.findMaxOfTwoNumber(6, 6));
        System.out.println("hypotenuse of right triangle: " + calc.hypotenuseOfRightTriangle(3, 5));
        System.out.println("last char of string: " + calc.lastCharOfString("java"));
        calc.isoscelesTriangle(5);

        calc.isoscelesTriangleUseRepeat(5);
    }
}
