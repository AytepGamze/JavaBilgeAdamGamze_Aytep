package week04.collections.list.arraylist;

import week04.polymorphism.runtime.ornek01.Animal;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02 {
    public static void main(String[] args) {
        List<String> animalList = new ArrayList<>();

        animalList.add("kostebek");
        animalList.add("tavsan");
        animalList.add("sincap");
        animalList.add("kedi");

        System.out.println("List : " + animalList);

    }


}
