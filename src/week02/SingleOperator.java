package week02;

public class SingleOperator {
    public static void main(String[] args) {
        int number1 = 87, number2 = 13;
        boolean condition = true;

        // On arttirma ve azaltma operatoru;
        System.out.println("(A) Degeri : " + number1 + "\t(++A) Degeri : " + (++number1));
        System.out.println("(B) Degeri : " + number2 + "\t(--B) Degeri : " + (--number2));

        //Sonra arttirma ve azaltma operatorleri;
        System.out.println("(A) Degeri : " + number1 + "\t(A++) Degeri : " + (number1++));
        System.out.println("(B) Degeri : " + number2 + "\t(B--) Degeri : " + (number2--));

        System.out.println("A degeri = " + number1 + " B degeri = " + number2);

        // Mantıksal degil op;
        System.out.println("Degil (!): " + !condition);


    }
}
