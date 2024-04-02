package week04.collections.list;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ArrayList03 {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        nameList.add("Java");
        nameList.add("Python");
        nameList.add("C#");

        // Listenin bir elemanını değiştirme
        System.out.println("List Before Set : " + nameList);
        nameList.set(1,"Scala");
        System.out.println("List After Set : " + nameList);


        // Listenin bir elemanını indexle çıkarma
        System.out.println("List Before Remove : " + nameList);
        nameList.remove(2);
        System.out.println("List After Remove : " + nameList);




        // Listenin bir elemanını içeriğiyle çıkarma
        System.out.println("List Before Remove : " + nameList);
        nameList.remove("Scala");
        System.out.println("List After Remove : " + nameList);



    }
}
