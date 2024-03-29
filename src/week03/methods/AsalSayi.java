package week03.methods;

import java.util.Scanner;

public class AsalSayi {
    int sayi;

    // Parametresiz constructor
    AsalSayi() {
        this.sayi = 0; // veya istediğiniz bir varsayılan değer
    }

    // Parametreli constructor
    AsalSayi(int sayi) {
        this.sayi = sayi;
    }



    // Sayının asal olup olmadığını kontrol eden metot
    boolean asalMi() {
        if (sayi <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(sayi); i++) {
            if (sayi % i == 0) {
                return false;
            }
        }
        return true;
    }
}

class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int girilenSayi = scanner.nextInt();

        AsalSayi asalSayi = new AsalSayi(girilenSayi);
        if (asalSayi.asalMi()) {
            System.out.println(girilenSayi + " bir asal sayıdır.");
        } else {
            System.out.println(girilenSayi + " bir asal sayı değildir.");
        }
        scanner.close();
    }
}
// TODO SORUNUN ASIL CEVABI ASALSAYISORUSU PAKETİNİN İCİNDEKİ PRIMENUMBERCALCULATOR SINIFINDA
