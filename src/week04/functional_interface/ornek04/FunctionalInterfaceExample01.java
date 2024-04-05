package week04.functional_interface.ornek04;


import week04.polymorphism.compiletime.ornek01.MathOperations;

public class FunctionalInterfaceExample01 {
    public static void main(String[] args) {
        MathOperation addition= (a, b) -> a+b;
        MathOperation subtraction= (a, b) -> a-b;
        MathOperation multiplication= (a, b) -> a*b;
        MathOperation division= (a, b) -> a/b;

        //Lambda expression kullanarak......
    }
    private static int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operate(a,b);
    }
}
