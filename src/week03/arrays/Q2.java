package week03.arrays;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        // kullanıcıdan o girene kadar hep sayılar alan ve o girdiğinde o zamana kadar girdiği tüm sayıların toplamını
        //ekrana yazdıran java kodunu yazınız.

        int sayi;
        int toplam =0;
        while (true){
            Scanner scanner= new Scanner(System.in);
            System.out.println("Sayı giriniz: ");
            sayi = scanner.nextInt();

            if (sayi==0) {
                System.out.println("0 sayisini girdiniz. Girilen sayilarin toplami hesaplaniyor..");
                break;
            }
            toplam += sayi;
        }
        System.out.println("Sayilarin toplami=" + toplam);
    }
}
