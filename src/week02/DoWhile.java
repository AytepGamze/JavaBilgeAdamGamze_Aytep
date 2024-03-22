package week02;

import java.sql.SQLOutput;

public class DoWhile {
    public static void main(String[] args) {
        int startValue = 0;
        do {
            System.out.println(startValue + "\t");
            startValue++;
        } while (startValue != 0 && startValue <=5);
    }
}
