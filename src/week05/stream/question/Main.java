package week05.stream.question;

import java.util.Random;

public class Main {

    /**
     * 1- student sınıfı oluşturalım. ->name, surname, grade;
     *      * 1.1-> Encapsulated
     *      * 2- Main sınıfında girilen sayı kadar student nesnesi üreten bir metot yazalım.
     *      * (grade kısmı 0-100 aralığında rastgele değer alsın.)
     *      * 3- Daha sonra öğrencilerin not ortalamasını hesaplayıp dönen bir stream yazalım.
     * 4- Notu 50'den düşük olan öğrencileri liste olarak dönen bir stream.
     * 5- Öğrencilerin isimleri ve öğrencilerin notlarını yazdıran bir stream.
     */
    public static void main(String[] args) {
        Random random = new Random();
        Student student= new Student("Gamze", "Aytep", random.nextInt());



    }

}
