package week04.collections.list.arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayList04 {
    public static void main(String[] args) {
        ArrayList<Integer> numberlist = new ArrayList<>();
        numberlist.add(3);
        numberlist.add(4);
        numberlist.add(11);
        numberlist.add(4);
        System.out.println("Before sort: " +numberlist);
        Collections.sort(numberlist);
        System.out.println("After sort: " +numberlist+ "\n");
        Collections.sort(numberlist, Collections.reverseOrder());
        System.out.println("After reverse: " +numberlist+ "\n");
        numberlist.sort(Collections.reverseOrder());
        System.out.println("After reverse: " +numberlist+ "\n");

        System.out.println("Size: " + numberlist.size() + "\n");

        ArrayList numberList2 = (ArrayList) numberlist.clone();
        System.out.println("Clone List: " +numberList2+ "\n");

        ArrayList<Integer> numberList3 = numberlist;
        System.out.println("Assigned List: " + numberList3 + "\n");

        System.out.println("Contains 1? " + numberlist.contains(1) + "\n");
        System.out.println("Contains 4? " + numberlist.contains(4) + "\n");
        System.out.println("isEmpty? " + numberlist.isEmpty() + "\n");

        List<Integer> numberList4= new ArrayList<>();
        System.out.println("isEmpty? " + numberList4.isEmpty() + "\n");

        System.out.println("indexOf 4 : "+ numberList2.indexOf(4) + "\n");
        System.out.println("indexOf 2 : " +numberList2.indexOf(2) + "\n");


        System.out.println("for-each: " );
        for (Integer  number: numberlist) {
            System.out.println("number: " + number );

        }









    }


}
