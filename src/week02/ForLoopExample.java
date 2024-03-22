package week02;

import java.util.Random;
import java.util.Scanner;

public class ForLoopExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int sayi, sayac=0;
        System.out.print("Lütfen bir sayı giriniz : ");
        sayi = scanner.nextInt();
        for (int i=1; sayi>=i; i++){
            if(i%2 ==0){
                sayac++;
            }
        }System.out.println("Çift Sayısı : "+sayac);
    }

}