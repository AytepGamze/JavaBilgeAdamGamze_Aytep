package week03.oop.principles.inheritance.example02;

public class Circle extends Shape {
    double radius;

    public Circle() {
    }

    Circle(String color, double radius) {
        super(color);
        this.radius= radius;
    }
    @Override
    void draw() {
        System.out.println("drawing a circle");

    }
  @Override
    double calculateArea(){
//        return Math.PI*Math.pow(radius,2);
         return Math.PI*radius*radius;
    }
}
