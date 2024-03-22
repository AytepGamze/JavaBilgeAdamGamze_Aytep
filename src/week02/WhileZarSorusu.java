package week02;

import java.util.Random;

public class WhileZarSorusu {
    public static void main(String[] args) {
        int zar1, zar2;
        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            System.out.println((random.nextInt(6)+1));
        }
    }
}