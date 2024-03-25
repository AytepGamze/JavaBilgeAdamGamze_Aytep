package week03.arrays;

public class ArraysWithForLoops {
    public static void main(String[] args) {
        int[] age = {12,4,5};

        // for loop ile array'de gezme.
        for (int i = 0; i<age.length; i++) {
            System.out.println(age[i]);

        }
        //ArrayIndexOutOfBoundsException -> Array'in dışına taştığını gösterir.
    }
}
