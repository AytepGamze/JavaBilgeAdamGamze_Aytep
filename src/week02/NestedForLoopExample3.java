package week02;

public class NestedForLoopExample3 {
    public static void main(String[] args) {
        for(int j = 6; j>=1; j--) {
            for (int i = 1; i<=j; i++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}


