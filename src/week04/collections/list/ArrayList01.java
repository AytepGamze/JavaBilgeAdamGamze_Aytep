package week04.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {
    public static void main(String[] args) {
        // Array sınıfını kullanarak bir list ürettik.
        List<Integer> numberList = new ArrayList<>();
        // Listemize elemanlar ekledik.
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        System.out.println("List : " + numberList);
        // Listeden bir indexe erişim.
        int number= numberList.get(2); // auto unboxing
        System.out.println(number);


        // Listeden bir ögenin kaldırılması
        int removedNumber= numberList.remove(1);
        System.out.println("Removed element: " + removedNumber);
        System.out.println("List : " + numberList);
    }
}
