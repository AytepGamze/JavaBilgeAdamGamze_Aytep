package week02;

public class TypeCasting {
    public static void main(String[] args) {
        int dollar = 5;
        float dollarF = dollar;
        long dollarL = dollar;
        System.out.println("dollar:"+ dollar +
                         "\ndollarL:"+dollarL+
                         "\ndollarF:"+dollarF);

        float floatDollar = 13.5f;
        int intDollar = (int) floatDollar;
        System.out.println(floatDollar);
        System.out.println(intDollar);

        long longDollar = 24;
        int intDollar2 = (int) longDollar;







    }
}
