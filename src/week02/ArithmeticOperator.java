package week02;

public class ArithmeticOperator {
    public static void main(String[] args) {

        // degisken tanimlamasi
        int number1= 25, number2= 3, number3= 17;
        String websiteName= "Web Sitemiz: ", websiteUrl= "www.bilgeadam.com";

        // Stringlerde ekleme operatorü kullanırsak;
        System.out.println("Merhaba!\n" + websiteName + websiteUrl); // \n satır kırılımı icin kullanılır

        // Ekleme- Cikarma operatorleri;

        System.out.println("A - C = " + (number1 - number3));
        System.out.println("A + B = " + (number1 + number2));

        // Çarpma Ve Bölme Operatorleri;
        System.out.println("A * B = " + (number1 * number2));
        System.out.println("A / 5 = " + (number1 / 5 ));

        // Mod Alma op.;
        System.out.println("C % B = " + (number3 % number2));
    }

}
