package week03.constructor;

public class NoArgsConstructor {
    // Bu sınıfın içersinde isim, soyisim ve ülke fieldleri olsun. Ülke fieldini içeriden atayan
    // bir parametresiz constructor oluşturalım.
    // Ülke değeri bir nesne oluşturulması durumunda direkt olarak "Türkiye" değerini alsın.
    // Sonrasında bu sınıftan 3 adet nesne üretip, isim, soyisim bilgilerini doldurup, ülkelerinin
    // konsol çıktılarını alalım.
    public String isim;
    public String soyisim;
    public String ülke;

    // Parametresiz constructor
    public NoArgsConstructor() {
        this.ülke = "Türkiye";
    }

    public static void main(String[] args) {

        NoArgsConstructor nesne1 = new NoArgsConstructor();
        nesne1.isim = "Gamze";
        nesne1.soyisim = "Farketmez";
        System.out.println("1. Nesne Ülke: " + nesne1.ülke);

        NoArgsConstructor nesne2 = new NoArgsConstructor();
        nesne2.isim = "Ahmet";
        nesne2.soyisim = "Marka";
        System.out.println("2. Nesne Ülke: " + nesne2.ülke);

        NoArgsConstructor nesne3 = new NoArgsConstructor();
        nesne3.isim = "Tuba";
        nesne3.soyisim = "Kalite";
        System.out.println("3. Nesne Ülke: " + nesne3.ülke);
    }
// Kodun orijinal hali hocada var, githubdan al
}
