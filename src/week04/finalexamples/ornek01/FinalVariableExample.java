package week04.finalexamples.ornek01;

public class FinalVariableExample {
    private static final double PI= 3.14159; //final degiskenler buyuk harfle yazılır.

    public static void main(String[] args) {
        final int age=10;
        System.out.println(age);
        // age= 25; bunu uygulayamayız. Age degiskeni final oldugu icin yeni bir deger ataması kabul etmez.
        System.out.println(age);

    }
}
