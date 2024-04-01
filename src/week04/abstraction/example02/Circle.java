package week04.abstraction.example02;

public class Circle extends Shape {

 private   double radius;

 public Circle(double radius) {
     this.radius= radius;
 }


    @Override
   public double calculateArea() {
//        return Math.PI*Math.pow(radius,2);
        return Math.PI*radius*Math.pow(radius,2);
    }

    public static class Main {
        public static void main(String[] args) {
           //shape sınıfından nesne oluşturulamaz, çünkü shape sınıfı soyut bir sınıftır.
            Shape shape= new Shape() {
                @Override
                public double calculateArea() {
                    return 0;
                }
            };
            System.out.println("--------Rectangle------");
            Rectangle rectangle= new Rectangle(5,3);
            System.out.println(rectangle.calculateArea());
            rectangle.draw();

            System.out.println("-----Circle---");
            Circle circle= new Circle(3.5);
            System.out.println(circle.calculateArea());
            circle.draw();
                }
            }
}
