public class Rectangle extends Shape {
    private float width;
    private float height;
    public void Rectangle(float width, float height){
        this.height = height;
        this.width = width;
    }
    public void calculateArea(){
        System.out.println("Area: " + width * height);
    }

    public void calculatePerimeter(){
        System.out.println("Perimeter: " + 2 * (height + width));
    }
}
