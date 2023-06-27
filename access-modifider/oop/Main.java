package oop;

public class Main {
    public static void main(String[] args) {
        ChildClass childObject = new ChildClass();

        // accessing protected members from the child class
        childObject.childMethod();
    }
}
