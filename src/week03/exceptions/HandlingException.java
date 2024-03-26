package week03.exceptions;

public class HandlingException {
    public static void main(String[] args) {
        int num1 = 5;
        try {
            System.out.println(num1/0);
            System.out.println("Try blok ici");

        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException!");

        }
            finally {
            System.out.println("Merhaba");
            System.out.println("Dunya");
        }
        System.out.println("kodun bitisi");

    }
}
