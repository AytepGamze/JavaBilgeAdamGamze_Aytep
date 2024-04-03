package week04.collections.list.linkedlist;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedList01 {
    public static void main(String[] args) {
        Queue<String> languageQueue = new LinkedList<>();

        //Elemanlar ekleyelim.
        languageQueue.add("Python");
        languageQueue.add("Java");
        languageQueue.add("C");
        System.out.println("LinkedList : " + languageQueue);


        //en baştaki elemana erişelim.
        String str1= languageQueue.peek(); //en baştaki elemanı görüntüler
        System.out.println("Accessed Element: " + str1);

        //en baştaki elemana erişelim. Aynı zamanda da listeden çıkaralım.
        String str2= languageQueue.poll();
        System.out.println("Removed Element: " + str2);
        System.out.println("LinkedList after poll: " + languageQueue);


        // lisetenin sonuna eleman ekleyelim.
        languageQueue.offer("Swift");
        System.out.println("LinkedList after offer: " + languageQueue);


    }

}
