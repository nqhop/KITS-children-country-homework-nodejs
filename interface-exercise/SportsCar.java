class SportsCar implements MyCar{
    private String brand;

    public SportsCar(String brand){
        this.brand = brand;
    }

    public void start() {
        System.out.println(brand + " sports car is starting with a roar");
    }

    public void stop() {
        System.out.println(brand + " sports car has stopped");
    }

    public void drive(double distance) {
        System.out.println(brand + " sports car is friving for " + distance + " kilometers");
    }

}
