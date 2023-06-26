public class Trangle extends Shape {
    private float width;
    public void Rectangle(float width){
        this.width = width;
    }
    public void calculateArea(){
        System.out.println("Area: " + width * width);
    }

    public void calculatePerimeter(){
        System.out.println("Perimeter: " + 4 * width);
    }
}
