package week03.oop.principles.inheritance.example02;

public abstract class Shape {
    String color;

    public Shape(String color) {
        this.color = color;
    }
    public Shape() {
    }

    void draw() {
        System.out.println("Drawing a shape");
    }
    double calculateArea() {
        return 0.0;

    }
}
