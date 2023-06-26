public class Main {
    public static void main(String[] args) {
        Car car = new SportCar("Ferrari", "Red", 100);
        car.start();
        car.displayInfo();
        car.stop();
    }
}
