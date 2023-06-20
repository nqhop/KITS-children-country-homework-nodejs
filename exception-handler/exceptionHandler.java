import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class exceptionHandler {
    public static void main(String[] args) {
        // try{
        // int[] numbers = {1, 2, 3};
        // int result = divide(numbers, 0);
        // System.out.println("Result: " + result);
        // }catch (ArithmeticException ex){
        // System.out.println("ArithmeticException: " + ex.getMessage());
        // }catch(ArrayIndexOutOfBoundsException ex){
        // System.out.println("ArrayIndexOutOfBoundsException: " +ex.getMessage());
        // }catch(Exception ex){
        // System.out.println("Generic Exception: " + ex.getMessage());
        // }finally {
        // System.out.println("Cleanup code goes here");
        // }

        processFile("example.txt");
    }

    // public static int divide(int[] numbers, int divisor) {
    // int result = 0;
    // try{
    // result = numbers[0] / divisor;
    // }catch (ArithmeticException ex){
    // throw ex;
    // }catch (ArrayIndexOutOfBoundsException ex){
    // throw ex;
    // }
    // return result;
    // }

    public static void processFile(String fileName) {
        try {
            Integer devide = 10 / 0;
            System.out.println("devide: " + devide);
        } catch (ArithmeticException ex) {
            System.out.println("error: processFile: " + ex);
        }

        try {
            FileReader fileReader = new FileReader(fileName);
            fileReader.close();
            // } catch (FileNotFoundException ex) {
            // System.out.println("error: processFile: " + ex);
        } catch (IOException ex) {
            System.out.println("error: processFile: " + ex);
        } finally {
        }
    }
}