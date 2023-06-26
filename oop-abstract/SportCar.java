public class SportCar extends Car{
    private int price;
    public SportCar(String brand, String color,int price){
        super(brand, color); // parend constructor
        this.price = price;
    }

    // implement
    public void start() {
        System.out.println("Sports car is starting with a roar");
    }

    // over write
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Price: " + price);
    }
}
