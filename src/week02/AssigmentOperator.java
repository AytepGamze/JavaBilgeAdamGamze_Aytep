package week02;

public class AssigmentOperator {
    public static void main(String[] args) {
        byte byteNumber = 126;
        short shortNumber = 327;
        int intNumber = 1058;
        long longNumber = 12042;
        float floatNumber = 42.8f;
        double doubleNumber = 8.58;
        char character = 'A';
        boolean booleanInformation = true;

        // Referans Veri Tipleri (string ile sınırlı);
        String myText= "Merhaba !", myWeb = "www.bilgeadam.com";

        // Ekrana Yazdırma Komutları:
        System.out.println(myText
                +"\nByte Degeri: "+byteNumber
                +"\nShort Degeri:"+shortNumber
                +"\nInteger Degeri:"+intNumber
                +"\nLong Degeri:"+longNumber
                +"\nFloat Degeri:"+floatNumber
                +"\nDouble Degeri:"+doubleNumber
                +"\nChar Degeri:"+character
                +"\nBoolean Degeri:"+ booleanInformation
                +"\nMyWeb:"+ myWeb

        );

        System.out.println(myWeb);



    }
}
