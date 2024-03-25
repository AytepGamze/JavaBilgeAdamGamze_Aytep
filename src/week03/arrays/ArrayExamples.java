package week03.arrays;

public class ArrayExamples {
    public static void main(String[] args) {
        String [] stringArray= new String[100];
        int[] numbers= new int[30];
        double[] sayilar= new double[18];


        //yontem2: allocate first, assign later;
        long[] longArray= new long[3];
        longArray[0]= 10;
        longArray[1]= 15;
        longArray[2]= 20;

        //yontem1: direct instantiate;
        long[] longArray2= {10,15,20};


        System.out.println("1. eleman: "+longArray2[0]);

        System.out.println("2. eleman: "+longArray2[1]);

        System.out.println("3. eleman: "+longArray2[2]);


        long[] longArray3= {10,15,20};
        System.out.println(longArray3);


    }
}
