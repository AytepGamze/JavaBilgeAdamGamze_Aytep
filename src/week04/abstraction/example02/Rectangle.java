package week04.abstraction.example02;

public class Rectangle extends Shape {
    private double width;
    private double height;
    Rectangle(double width, double height){
        this.width= width;
        this.height= height;

    }

//    @Override
//    public double calculateArea() {
//        return 0.0;
//
//    }

    @Override
    public double calculateArea() {
        return width*height;
    } //alt+insert-> implement methods
}
