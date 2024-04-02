package week04.enums;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(Size.SMALL);
        System.out.println(Size.MEDIUM);
       Test test= new Test(Size.EXTRALARGE);
       test.orderPizza();

        System.out.println("----ORDINAL----");
      //ordinal() metodu bana index değeerini döner.
        System.out.println(Size.EXTRALARGE.ordinal());
        System.out.println(Size.SMALL.ordinal());
        System.out.println(Size.MEDIUM.ordinal());
        System.out.println(Size.LARGE.ordinal());


        System.out.println("\n---COMPARE TO----");
        System.out.println(Size.SMALL.compareTo(Size.MEDIUM));
        System.out.println(Size.MEDIUM.compareTo(Size.SMALL));
        System.out.println(Size.EXTRALARGE.compareTo(Size.SMALL));


        System.out.println("\n---TO STRING----");
        System.out.println(Size.EXTRALARGE.toString());
        String str1= Size.EXTRALARGE.toString();
        if (Size.EXTRALARGE.toString().equals("EXTRALARGE")) {
            System.out.println("toString.equals");
        }



        System.out.println("\n---NAME METHOD----");
        if (Size.EXTRALARGE.name().equals("EXTRALARGE")) {
            System.out.println("equals name method");
        }

        System.out.println("\n---VALUE OF METHOD----");
        if (Size.EXTRALARGE== Size.valueOf("EXTRALARGE")) {
            System.out.println("equals valueOf method");
        }

        System.out.println("\n---VALUES METHOD----");
        Size[] sizeArr= Size.values();
        List<Size> sizeList = Arrays.asList(Size.values());

        for (Size size: Size.values()) {
            System.out.println(size);
        }


    }
}
