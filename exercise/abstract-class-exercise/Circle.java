public class Circle extends Shape {
    private float r;
    public void Circle(float r){
        this.r = r;
    }
    public void calculateArea(){
        System.out.println("Area: " + r * r * 3.14);
    }

    public void calculatePerimeter(){
        System.out.println("Perimeter: " + 2 * 3.14 * r);
    }
}
