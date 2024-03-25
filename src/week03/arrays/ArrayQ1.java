package week03.arrays;

public class ArrayQ1 {
    public static void main(String[] args) {
     // Aşağıdaki sayıları bir dizi içerisine tanımlayınız. Daha sonra for/foreach kullanarak topamını bulup ekrana
        // yazdıran ve sonrasında ort da hesaplayan  ekran ayzdıran java kodunu yazınız.

        int[] numberArr= {2,-9,0,5,12,-25,22,9,8,12};

        int toplam = 0;
        double ortalama;
        for(int number: numberArr) {
            toplam= toplam + number;

        }
        System.out.println("Toplam: ");
        ortalama= toplam/(double)numberArr.length;
        System.out.println(ortalama);

        //for(int number : numberArr) {

// KOD EKSİK YAZILDI SONRA TAMAMLA
            }

        }

