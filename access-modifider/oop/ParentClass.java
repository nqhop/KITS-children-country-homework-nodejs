package oop;
public class ParentClass {
    protected int protectedVariable = 10;

    protected void protectedMethod() {
        System.out.println("This is a protected");
    }

    final void printMessage() {
        System.out.println("This is final method");
    }
}