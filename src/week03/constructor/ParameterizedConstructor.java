package week03.constructor;
// ad, soyad, yaş ve cnsiyet fieldlerini belirleyelim. Sonrasında bu sınıfın 2 adet nesnesini oluşturalım.
// Bu nesnelerin yaş ve cinsiyet değerleri, constructor parametresinden oluşturma anında verilsin. Diğer
// 2 değeri elle girelim.
public class ParameterizedConstructor {
    String ad;
    String soyad;
    int yas;
    String cinsiyet;

    // Parametreli constructor
    public ParameterizedConstructor(int yas, String cinsiyet) {
        this.yas = yas; // isim çakışması olduğu için this. anahtar kelimesini kullanarak sınıfımın
        //fieldı olan yas'a eriseceğini belirtiyorum.

        this.cinsiyet = cinsiyet;
    }

    public static void main(String[] args) {
        // 2 adet nesne oluşturalım
        ParameterizedConstructor person1 = new ParameterizedConstructor(2, "Erkek");
        person1.ad = "Ahmet";
        person1.soyad = "Marka";

        ParameterizedConstructor person2 = new ParameterizedConstructor(24, "Kadın");
        person2.ad = "Gamze";
        person2.soyad = "Farketmez";

        // Nesne bilgilerini yazdıralım
        System.out.println("1. Kisi:");
        System.out.println("Ad: " + person1.ad);
        System.out.println("Soyad: " + person1.soyad);
        System.out.println("Yas: " + person1.yas);
        System.out.println("Cinsiyet: " + person1.cinsiyet);

        System.out.println("\n2. Kisi:");
        System.out.println("Ad: " + person2.ad);
        System.out.println("Soyad: " + person2.soyad);
        System.out.println("Yas: " + person2.yas);
        System.out.println("Cinsiyet: " + person2.cinsiyet);

    }
}
